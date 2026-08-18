package com.xworkz.msk.dao;

import com.xworkz.msk.entity.FeedBackEntity;

public class FeedBackDaoImpl implements FeedBackDao {
    @Override
    public boolean save(FeedBackEntity feedBackEntity) {
        System.out.println("running save in FeedBackDaoImpl");
        System.out.println("FeedBackEntity: "+feedBackEntity);
        return true;
    }
}
