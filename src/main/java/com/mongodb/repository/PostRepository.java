package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
