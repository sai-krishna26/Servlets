package com.xworkz.msk.service.signIn;

import com.xworkz.msk.dao.signIn.SignInDao;
import com.xworkz.msk.dao.signIn.SignInDaoImpl;
import com.xworkz.msk.dto.SignInDto;
import com.xworkz.msk.entity.SignInEntity;

public class SignInServiceImpl implements SignInService {
    @Override
    public boolean validateAndSave( SignInDto signInDto) {
        System.out.println("running validateAndSave() in SignInServiceImpl");

        if (signInDto!=null)
        {
            System.out.println("valid dto, ready to send in dao");
            SignInEntity signInEntity=new SignInEntity();
            signInEntity.setUsername(signInDto.getUsername());
            signInEntity.setPassword(signInDto.getPassword());

            SignInDao signInDao=new SignInDaoImpl();
            signInDao.save(signInEntity);
        }
        return true;
    }
}
