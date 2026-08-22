package com.xworkz.smartChat.service.logIn;

import com.xworkz.smartChat.dto.LogInDto;

public class LogInServiceImpl implements LogInService {
    @Override
    public boolean validateAndSave(LogInDto logInDto) {
        System.out.println("running validateAndSave() in LogInServiceImpl");
        if(logInDto!=null)
        {
            System.out.println("logInDto is not null");
            System.out.println("logInDto: "+logInDto);
        }
        else
        {
            System.out.println("logInDto is null");
            return false;
        }
        return false;
    }
}

