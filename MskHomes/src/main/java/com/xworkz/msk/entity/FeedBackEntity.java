package com.xworkz.msk.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@ToString
public class FeedBackEntity {
    private String name;
    private String email;
    private String mobile;
    private String comment;
}
