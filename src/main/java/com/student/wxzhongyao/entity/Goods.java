package com.student.wxzhongyao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Goods implements Serializable {
    private Integer goods_id;
    private Integer class_id;
    private String goods_name;
    private String goods_pinyin;
    private String goods_poster;
    private String goods_description;

}
