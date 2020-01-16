package com.scs.solf.mosoteach.background.domain.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Yujie_Zhao
 * @ClassName UserDev
 * @Description TODO
 * @Date 2020/1/16  19:55
 * @Version 1.0
 **/
@Data
@Builder
public class UserDev {
    private Integer id;
    private String mobile;
    private String password;
    private String code;
}