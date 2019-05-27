package com.nelioalves.workshopmongo.services;

import com.nelioalves.workshopmongo.domains.Post;
import com.nelioalves.workshopmongo.repositories.PostRepository;
import com.nelioalves.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow( () -> new ObjectNotFoundException("Post não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repository.findByTitleContainingIgnoreCase(text);
    }
}
