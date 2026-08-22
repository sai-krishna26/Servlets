package com.xworkz.smartChat.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    public RegisterDto(String username, String email, String password, String confirmPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "SignUpDto{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
