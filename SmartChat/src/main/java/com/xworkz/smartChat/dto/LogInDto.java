package com.xworkz.smartChat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogInDto implements Serializable {

    private String username;
    private String password;

    @Override
    public String toString() {
        return "LogInDto [username=" + username +"]";
    }
}
