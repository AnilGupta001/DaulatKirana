package com.blog.api.Services;

import java.util.List;
import java.util.stream.Collectors;import org.hibernate.metamodel.internal.EntityRepresentationStrategyPojoStandard;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.blog.api.Entity.Category;
import com.blog.api.Entity.Post;
import com.blog.api.Entity.User;
import com.blog.api.Exception.ConfigDataResourceNotFoundException;
import com.blog.api.Payloads.CategoryDTO;
import com.blog.api.Payloads.PostDTO;
import com.blog.api.Payloads.UserDTO;
import com.blog.api.Repositorys.PostRepo;

@Service
public class PostIMP  implements PostService{
	@Autowired
private PostRepo postRepo;
	@Autowired
private  ModelMapper mapper;
private UserIMP userIMP;
private CategoryService categoryService;
	
	@Override
	public PostDTO createPostDTO(PostDTO postDTO, Integer UserID, Integer categoryID) {
	 UserDTO userDTO=userIMP.getByID(UserID);
	 CategoryDTO categoryDTO=categoryService.getCategoryDTOByID(categoryID);
	 postDTO.setUser(userDTO);
	 postDTO.setCategory(categoryDTO);
	 Post post=mapper.map(postDTO,Post.class);
	 postRepo.save(post);
	 return postDTO;
	 
	}

	@Override
	public PostDTO updatePostDTO(PostDTO postDTO, Integer postID) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void PostBYID(Integer PostID) {
		Post post =null;
	try {
	 post=postRepo.findById(PostID).orElseThrow(()->new ConfigDataResourceNotFoundException("Post","ID",PostID));
	} catch (ConfigDataResourceNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	postRepo.delete(post);
	}

	@Override
	public List<PostDTO> getAllPost(int page, int pageSize) {
		PageRequest pageRequest=PageRequest.of(page, pageSize);
		Page<Post> posts=this.postRepo.findAll(pageRequest);
		List<PostDTO> postDTO= posts.getContent().stream().map(p->mapper.map(p, PostDTO.class)).collect(Collectors.toList());
	return postDTO;
	}

	@Override
	public PostDTO getPostByID(int id) {
		Post post=null;
	try {
		 post=postRepo.findById(id).orElseThrow(()->new ConfigDataResourceNotFoundException("Post","ID",id));
	} catch (ConfigDataResourceNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mapper.map(post, PostDTO.class);
	}

	@Override
	public List<PostDTO> getPostsByUser(int user_id) {
	    List<Post> postList = postRepo.findAll();
	    
	    List<PostDTO> filteredPostDTOs = postList.stream()
	            .map(post -> mapper.map(post, PostDTO.class))
	            .filter(postDTO -> postDTO.getUser().getId() == user_id)
	            .collect(Collectors.toList());

	    return filteredPostDTOs;
	}

	@Override
	public List<PostDTO> getPostsByCategory(int user_id) {
		 List<Post> postList = postRepo.findAll();
		    
		    List<PostDTO> filteredPostDTOs = postList.stream()
		            .map(post -> mapper.map(post, PostDTO.class))
		            .filter(postDTO -> postDTO.getCategory().getCatId() == user_id)
		            .collect(Collectors.toList());

		    return filteredPostDTOs;
	}

	@Override
	public List<PostDTO> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
