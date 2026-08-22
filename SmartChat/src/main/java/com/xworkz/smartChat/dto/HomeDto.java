package com.xworkz.smartChat.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class HomeDto implements Serializable {
    private String name;
    private LocalDate dateOfBirth;
    private String actor;
    private String movie;
    private String ownMovie;
    private boolean isImageUploaded;
}
