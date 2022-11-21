package com.marcosfausto.workshopmongo.repository;

import com.marcosfausto.workshopmongo.domain.Post;
import com.marcosfausto.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
