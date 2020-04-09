package com.student.wxzhongyao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class CollectGoods {
    private Integer user_id;
    private Integer goods_id;
    private String goods_name;
    private String goods_poster;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date collect_time;
}
