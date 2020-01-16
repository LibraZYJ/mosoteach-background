package com.scs.solf.mosoteach.background.domain.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * @author Yujie_Zhao
 * @ClassName SiginDto
 * @Description TODO
 * @Date 2020/1/16  19:56
 * @Version 1.0
 **/
@Data
@Builder
public class SignDto {
    @NonNull
    private String mobile;
    private String password;
    private String sms;
}
