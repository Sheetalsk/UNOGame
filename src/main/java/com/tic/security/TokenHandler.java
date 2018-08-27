package com.tic.security;

public interface TokenHandler {
    String issue();

    void verify(String token);
}
