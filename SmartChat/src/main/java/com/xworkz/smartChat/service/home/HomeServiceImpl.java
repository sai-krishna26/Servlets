package com.xworkz.smartChat.service.home;

import com.xworkz.smartChat.dto.HomeDto;

public class HomeServiceImpl implements HomeService{
    @Override
    public boolean validateAndSave(HomeDto homeDto) {
        if(homeDto!=null)
        {
            System.out.println("HomeDto is not null");
            System.out.println(homeDto);
            return true;
        }
        else
        {
            System.out.println("HomeDto is null");
            return false;
        }
    }
}
