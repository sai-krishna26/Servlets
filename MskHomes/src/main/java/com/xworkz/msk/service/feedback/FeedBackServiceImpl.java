package com.xworkz.msk.service.feedback;

import com.xworkz.msk.dao.FeedBackDao;
import com.xworkz.msk.dao.FeedBackDaoImpl;
import com.xworkz.msk.dto.FeedBackDto;
import com.xworkz.msk.entity.FeedBackEntity;

public class FeedBackServiceImpl implements FeedBackService {
    @Override
    public boolean validateAndSave(FeedBackDto feedBackDto) {
        System.out.println("running validateAndSave in FeedBackServiceImpl");
        if(feedBackDto!=null)
        {
            System.out.println("valid Dto,ready to save in dao");

            FeedBackEntity feedBackEntity=new FeedBackEntity();
            feedBackEntity.setName(feedBackDto.getName());
            feedBackEntity.setEmail(feedBackDto.getEmail());
            feedBackEntity.setMobile(feedBackDto.getMobile());
            feedBackEntity.setComment(feedBackDto.getComment());

            FeedBackDao feedBackDao=new FeedBackDaoImpl();
            feedBackDao.save(feedBackEntity);
        }
        return true;
    }
}
