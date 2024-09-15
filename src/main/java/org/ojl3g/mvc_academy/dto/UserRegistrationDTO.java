package org.ojl3g.mvc_academy.dto;

import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String login;
    private String password;
    private String phoneNumber;
    private String fullName;
    private int level;
}
