package com.xworkz.msk.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@ToString
@Getter
public class FeedBackEntity {
    private String name;
    private String email;
    private String mobile;
    private String comment;
}
