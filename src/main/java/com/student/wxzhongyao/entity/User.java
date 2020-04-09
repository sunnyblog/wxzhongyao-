package com.student.wxzhongyao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Data
public class User {
    private Integer user_id;
    private String name;
    private String phone;
    private String password;

}
