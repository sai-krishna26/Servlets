package com.xworkz.msk.service.signOut;

import com.xworkz.msk.dao.signUp.SignUpDao;
import com.xworkz.msk.dao.signUp.SignUpDaoImpl;
import com.xworkz.msk.dto.SignUpDto;
import com.xworkz.msk.entity.SignUpEntity;

public class SignUpServiceImpl implements SignUpService {
    @Override
    public boolean validateAndSave(SignUpDto signUpDto) {
        System.out.println("running validateAndSave() in SignUpServiceImpl");

        if (signUpDto != null) {
            System.out.println("valid dto, ready to send in dao");
            SignUpEntity signUpEntity = new SignUpEntity();
            signUpEntity.setUsername(signUpDto.getUsername());
            signUpEntity.setEmail(signUpDto.getEmail());
            signUpEntity.setPassword(signUpDto.getPassword());
            signUpEntity.setConfirmPassword(signUpDto.getConfirmPassword());

            SignUpDao signUpDao = new SignUpDaoImpl();
            signUpDao.save(signUpEntity);
        }
        return true;
    }
}
