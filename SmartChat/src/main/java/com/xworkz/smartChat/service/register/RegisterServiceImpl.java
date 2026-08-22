package com.xworkz.smartChat.service.register;

import com.xworkz.smartChat.dto.RegisterDto;

public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean validateAndSave(RegisterDto registerDto) {
        if(registerDto!=null)
        {
            System.out.println("Running validateAndSave() in RegisterServiceImpl");
            System.out.println("RegisterDto is not null");
            System.out.println("RegisterDto is " + registerDto);
            return true;
        }
        else {
            System.out.println("RegisterDto is null");
            return false;
        }
    }
}
