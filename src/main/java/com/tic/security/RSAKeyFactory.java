package com.tic.security;

import lombok.Getter;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Getter
public class RSAKeyFactory {
    private static final String RSA = "RSA";
    private static final int KEY_SIZE = 1024;

    private KeyPair keyPair;
    private RSAPublicKey publicKey;
    private RSAPrivateKey privateKey;

    private RSAKeyFactory() {
        this.keyPair = this.getKeyGenerator().genKeyPair();
        this.publicKey = (RSAPublicKey) this.keyPair.getPublic();
        this.privateKey = (RSAPrivateKey) this.keyPair.getPrivate();
    }

    public static RSAKeyFactory getInstance() {
        return new RSAKeyFactory();
    }

    private KeyPairGenerator getKeyGenerator() {
        try{
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(RSA);
            kpg.initialize(KEY_SIZE);
            return kpg;
        } catch (NoSuchAlgorithmException e) {
            throw new SecurityException(e);
        }
    }
}
