package com.nelioalves.workshopmongo.repositories;

import com.nelioalves.workshopmongo.domains.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
