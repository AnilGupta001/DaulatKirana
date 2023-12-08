package com.example.Idea.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Idea.Entity.Post;
import com.example.Idea.Service.PostIMP;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostIMP postIMP;

    @PostMapping("/user/{user_id}/category/{category_id}/post")
    public ResponseEntity<Post> createPost(@RequestBody Post post,
                                           @PathVariable int user_id,
                                           @PathVariable int category_id) {
        Post post2 = postIMP.createPost(post, user_id, category_id);
        return new ResponseEntity<Post>(post2, HttpStatus.CREATED);
    }

    @GetMapping("/user/{user_id}/posts")
    public ResponseEntity<List<Post>> getPostByUser(@PathVariable int user_id) {
        List<Post> posts = postIMP.getPostsByUser(user_id);
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }

    @GetMapping("/category/{user_id}/posts")
    public ResponseEntity<List<Post>> getPostByCategory(@PathVariable int user_id) {
        List<Post> posts = postIMP.getPostsByCategory(user_id);
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }
    @GetMapping("/{page}/{pageSize}")
    public ResponseEntity<List<Post>> getAll(@PathVariable int page,@PathVariable int pageSize){
    	List<Post> list=postIMP.getAllPost(page, pageSize);
    	return new ResponseEntity<List<Post>>(list,HttpStatus.OK);
    }
}
