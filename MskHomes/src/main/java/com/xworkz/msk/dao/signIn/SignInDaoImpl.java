package com.xworkz.msk.dao.signIn;

import com.xworkz.msk.entity.SignInEntity;

public class SignInDaoImpl implements SignInDao{
    @Override
    public boolean save(SignInEntity signInEntity) {
        System.out.println("running save() in SignInDaoImpl,data saved");
        System.out.println("signInEntity = " + signInEntity);
        return true;
    }
}
