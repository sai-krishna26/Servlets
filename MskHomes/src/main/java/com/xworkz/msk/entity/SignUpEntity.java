package com.xworkz.msk.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
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
