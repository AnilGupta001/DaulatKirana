package com.example.Idea.Service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Idea.Entity.Category;
import com.example.Idea.Entity.Post;
import com.example.Idea.Entity.User;
import com.example.Idea.Repository.CategoryRepo;
import com.example.Idea.Repository.PostRepo;
import com.example.Idea.Repository.UserRepository;

@Service
public class PostIMP implements PostService{
@Autowired
private PostRepo postRepo;
@Autowired
UserRepository userRepository;
@Autowired
CategoryRepo cateRepo;
	
	@Override
	public Post createPost(Post post,int user_id,int category_id) {
		User user=userRepository.findById(user_id).orElseThrow();
		Category category=cateRepo.findById(category_id).orElseThrow();
		post.setUser(user);
		post.setCategory(category);
		return postRepo.save(post);
	}

	@Override
	public Post updatePost(Post post, int id) {
		Post post2=postRepo.findById(id).orElseThrow();
	    
		return post2;
	}

	@Override
	public void delete(int id) {
	
	}

	@Override
	public List<Post> getAllPost(int page,int pageSize) {
	    PageRequest pageable = PageRequest.of(page,pageSize);
	    Page<Post> pagePost = this.postRepo.findAll(pageable);
	    List<Post> posts = pagePost.getContent();
	    return posts;
	}


	@Override
	public Post getPostByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByUser(int user_id) {

User category=userRepository.findById(user_id).orElseThrow();
List<Post> posts=postRepo.findByUser(category);
	return posts;	
	}

	@Override
	public List<Post> getPostsByCategory(int user_id) {
	Category category=cateRepo.findById(user_id).orElseThrow();
	List<Post> posts=postRepo.findByCategory(category);
	
		return posts;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
