package com.xworkz.msk.dto;

import java.io.Serializable;

public class FeedBackDto implements Serializable {
    private String email;
    private String name;
    private String mobile;
    private String comment;

    public FeedBackDto(String name, String email, String mobile, String comment) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.comment = comment;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getComment()
    {
        return comment;
    }


    @Override
    public String toString() {
        return "FeedBackDto{"+"name:" + name + ","+
                "email:" + email +","+
                "mobile:" + mobile +","+
                "comment:" + comment +"}";
    }
}
