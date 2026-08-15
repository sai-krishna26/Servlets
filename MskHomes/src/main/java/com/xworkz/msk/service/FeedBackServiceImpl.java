package com.xworkz.msk.service;

import com.xworkz.msk.dto.FeedBackDto;

public class FeedBackServiceImpl implements FeedBackService{
    @Override
    public boolean validateAndSave(FeedBackDto feedBackDto) {
        System.out.println("running validateAndSave in FeedBackServiceImpl");
        System.out.println("FeedBackDto:"+feedBackDto);
        return true;
    }
}
