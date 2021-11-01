package com.victorhoffmann.mongospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.victorhoffmann.mongospring.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
