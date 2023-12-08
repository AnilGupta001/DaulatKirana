package com.example.Idea.Service;

import java.util.List;

import com.example.Idea.Entity.Post;

public interface PostService {
Post createPost(Post post,int user_id, int category_id);
Post updatePost(Post post,int id);
void delete(int id);
List<Post> getAllPost(int page,int pageSize);
Post getPostByID(int id);
List<Post> getPostsByUser(int user_id);
List<Post> getPostsByCategory(int user_id);
List<Post> searchPosts(String keyword);
	
}
