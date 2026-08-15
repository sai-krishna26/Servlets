package com.xworkz.msk.service;

import com.xworkz.msk.dto.SignUpDto;

public interface SignUpService {
    public boolean validateAndSave(SignUpDto signUpDto);
}
