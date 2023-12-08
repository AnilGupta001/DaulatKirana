package com.blog.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blog.api.Payloads.APIResoponce;
import com.blog.api.Payloads.PostDTO;
import com.blog.api.Services.PostService;

@RestController
@RequestMapping("/Post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/{UserID}/{CatogoryID}")
    public ResponseEntity<PostDTO> createEntity(PostDTO postDTO, @PathVariable Integer UserID, @PathVariable Integer CatogoryID) {
        return new ResponseEntity<PostDTO>(postService.createPostDTO(postDTO, UserID, CatogoryID), HttpStatus.CREATED);
    }

    @PutMapping("/{PostID}")
    public ResponseEntity<PostDTO> updateEntity(PostDTO postDTO, @PathVariable Integer PostID) {
        return new ResponseEntity<PostDTO>(postService.updatePostDTO(postDTO, PostID), HttpStatus.OK);
    }

    @GetMapping("/{page}/{pagesize}")
    public ResponseEntity<List<PostDTO>> getAllEntity(@PathVariable Integer page, @PathVariable Integer pagesize) {
        return ResponseEntity.ok(postService.getAllPost(page, pagesize));
    }

    @DeleteMapping("/{PostID}")
    public ResponseEntity<APIResoponce> delete(@PathVariable Integer PostID) {
        postService.PostBYID(PostID);
        return ResponseEntity.ok(new APIResoponce("Post", true));
    }
}
