package com.xworkz.msk.entity;

import lombok.Setter;
import lombok.ToString;

@Setter
public class SignInEntity {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "SignInEntity{" +
                "username='" + username + '\'' +
                '}';
    }
}
