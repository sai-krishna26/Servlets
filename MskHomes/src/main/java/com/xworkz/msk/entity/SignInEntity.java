package com.xworkz.msk.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
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
