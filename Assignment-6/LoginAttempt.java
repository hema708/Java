package com.java.basics;
public class LoginAttempt {
    public static void main(String[] args) {
        String password = "hema123";
        String enteredPassword = "hema123";
        int attempt = 1;
        while (attempt <= 3) {
            if (enteredPassword.equals(password)) {
                System.out.println("Login Successful");
                break;
            }
            else {
                System.out.println("Invalid Password");
            }
            attempt++;
        }
    }
}