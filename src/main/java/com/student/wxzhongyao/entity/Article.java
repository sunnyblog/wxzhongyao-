package com.student.wxzhongyao.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class Article implements Serializable {
     private Integer article_id;
     private String article_title;
     private String article_poster;
     private String article_description;
     @JsonFormat(pattern="yyyy-MM-dd")
     private Date article_date;
}
