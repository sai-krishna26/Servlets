package com.xworkz.smartChat.service;

import com.xworkz.smartChat.dto.RegisterDto;

public interface RegisterService {
    boolean validateAndSave(RegisterDto registerDto);
}
