package com.xworkz.msk.dto;

import java.io.Serializable;

public class SignInDto implements Serializable {
    private String username;
    private String password;

    public SignInDto(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    @Override
    public String toString() {
        return "SignInDto{" +
                "username='" + username + '\'' +
                '}';
    }
}
