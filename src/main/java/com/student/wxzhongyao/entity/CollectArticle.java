package com.student.wxzhongyao.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CollectArticle {
    private Integer user_id;
    private Integer article_id;
    private String article_title;
    private String article_poster;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date collect_time;

}
