package com.xworkz.msk.service.signIn;

import com.xworkz.msk.dto.SignInDto;

public interface SignInService {
    public boolean validateAndSave(SignInDto signInDto);
}
