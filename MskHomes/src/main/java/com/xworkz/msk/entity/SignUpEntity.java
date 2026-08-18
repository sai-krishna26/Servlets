package com.xworkz.msk.entity;

import lombok.Setter;
import lombok.ToString;

@Setter
public class SignUpEntity {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    @Override
    public String toString() {
        return "SignUpEntity{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
