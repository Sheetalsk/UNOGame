package com.tic.security;

import com.tic.model.User;

import java.io.Serializable;

public class BasicUserProvider implements UserProvider, Serializable {
    private static final long serialVersionID = 1L;

    @Override
    public User getCurrentUser() {
        return User.builder()
                .name("GG")
                .age(12)
                .build();
    }
}
