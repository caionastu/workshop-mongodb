package com.nelioalves.workshopmongo.config;

import com.nelioalves.workshopmongo.domains.User;
import com.nelioalves.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User alex = new User(null, "Alex", "alex@gmail.com");
        User bento = new User(null, "Bento", "bento@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bento));
    }
}
