package com.xworkz.msk.service;

import com.xworkz.msk.dto.SignInDto;

public class SignInServiceImpl implements SignInService{
    @Override
    public boolean validateAndSave( SignInDto signInDto) {
        System.out.println("running validateAndSave() in SignInServiceImpl");
        System.out.println("signInDto:"+signInDto);
        return true;
    }
}
