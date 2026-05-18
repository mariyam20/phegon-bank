package com.phegon.phegonbank.auth_users.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetPasswordRequest {

    //will be used to request for forgot password
    private String email;

    //    will bw used to set new passwored
    private String code;
    private String newPassword;

}
