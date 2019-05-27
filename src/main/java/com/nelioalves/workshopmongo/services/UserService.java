package com.nelioalves.workshopmongo.services;

import com.nelioalves.workshopmongo.domains.User;
import com.nelioalves.workshopmongo.dtos.UserDTO;
import com.nelioalves.workshopmongo.repositories.UserRepository;
import com.nelioalves.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow( () -> new ObjectNotFoundException("Usuário não encontrado"));
    }

    public User insert(User user){
        return userRepository.insert(user);
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
