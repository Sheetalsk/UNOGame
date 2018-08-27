package com.tic.security;

import com.auth0.jwt.algorithms.Algorithm;
import lombok.Getter;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Getter
public enum Algorithms {
    RSA512();

    private Algorithm algorithm;

    private static Algorithm initRSA512() {
        RSAKeyFactory keyFactory = RSAKeyFactory.getInstance();
        RSAPublicKey publicKey = keyFactory.getPublicKey();
        RSAPrivateKey privateKey = keyFactory.getPrivateKey();
        return Algorithm.RSA512(publicKey, privateKey);
    }
}
