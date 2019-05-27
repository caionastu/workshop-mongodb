package com.nelioalves.workshopmongo.dtos;

import com.nelioalves.workshopmongo.domains.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
