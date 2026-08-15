package com.xworkz.msk.service;

import com.xworkz.msk.dto.SignUpDto;

public class SignUpServiceImpl implements SignUpService {
    @Override
    public boolean validateAndSave(SignUpDto signUpDto) {
        System.out.println("running validateAndSave() in SignUpServiceImpl");
        System.out.println("signUpDto:"+signUpDto);
        return true;
    }
}
