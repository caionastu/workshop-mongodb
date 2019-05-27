package com.nelioalves.workshopmongo.repositories;

import com.nelioalves.workshopmongo.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
