package com.blog.api.Services;

import java.util.List;

import com.blog.api.Payloads.PostDTO;

public interface PostService {
PostDTO createPostDTO(PostDTO postDTO,Integer UserID,Integer categoryID);
PostDTO updatePostDTO(PostDTO postDTO,Integer postID);
void  PostBYID(Integer PostID);
List<PostDTO> getAllPost(int page,int pageSize);
PostDTO getPostByID(int id);
List<PostDTO> getPostsByUser(int user_id);
List<PostDTO> getPostsByCategory(int user_id);
List<PostDTO> searchPosts(String keyword);

}
