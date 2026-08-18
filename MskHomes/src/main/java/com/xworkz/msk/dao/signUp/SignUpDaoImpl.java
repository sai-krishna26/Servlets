package com.xworkz.msk.dao.signUp;

import com.xworkz.msk.entity.SignUpEntity;

public class SignUpDaoImpl implements SignUpDao {
    @Override
    public boolean save(SignUpEntity signUpEntity) {
        System.out.println("running save() in SignUpDaoImpl, data saved");
        System.out.println("signUpEntity = " + signUpEntity);
        return true;
    }
}
