package com.xworkz.msk.service.feedback;

import com.xworkz.msk.dto.FeedBackDto;

public interface FeedBackService {
    public boolean validateAndSave(FeedBackDto feedBackDto);
}