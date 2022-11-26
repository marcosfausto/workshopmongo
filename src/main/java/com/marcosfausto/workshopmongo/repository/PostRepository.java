package com.marcosfausto.workshopmongo.repository;

import com.marcosfausto.workshopmongo.domain.Post;
import com.marcosfausto.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }") // ?0 = primeiro parametro passado, $options: 'i' = case insensitive
    List<Post> searchTitle(String text);
    List<Post> findByTitleContainingIgnoreCase(String text);

}
