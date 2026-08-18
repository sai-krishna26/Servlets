package com.xworkz.msk.service;

import com.xworkz.msk.dto.FeedBackDto;
import com.xworkz.msk.entity.FeedBackEntity;

public class FeedBackServiceImpl implements FeedBackService{
    @Override
    public boolean validateAndSave(FeedBackDto feedBackDto) {
        System.out.println("running validateAndSave in FeedBackServiceImpl");
        if(feedBackDto!=null) {
            System.out.println("valid Dto");

            FeedBackEntity feedBackEntity=new FeedBackEntity();
            feedBackEntity.setName(feedBackEntity.getName());
        }
        return true;
    }
}
