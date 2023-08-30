package com.sonkq.librarymanagement.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private Integer deleteFlag;
}
