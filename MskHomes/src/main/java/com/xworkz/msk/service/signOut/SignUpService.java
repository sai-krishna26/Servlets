package com.xworkz.msk.service.signOut;

import com.xworkz.msk.dto.SignUpDto;

public interface SignUpService {
    public boolean validateAndSave(SignUpDto signUpDto);
}
