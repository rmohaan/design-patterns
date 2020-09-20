package com.codewithmosh.strategy;

public class ChatClient {
    public void send(String message, Encryptor encryptor) {
        encryptor.Encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}

public interface Encryptor {
    public void Encrypt(String message);
}

public class DESEncryptor implements Encryptor {
    public void Encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}

public class AESEncryptor implements Encryptor {
    public void Encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}