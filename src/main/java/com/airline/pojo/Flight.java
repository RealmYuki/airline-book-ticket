package com.airline.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tbl_flight")
public class Flight implements Serializable {//继承可序列化接口
    //主键
    private Long id;
    //出发地
    private String start;
    //目的地
    private String end;
    //出发日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    //价格
    private Integer price;
    //出发时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    //到达时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    //剩余票数
    private Integer number;
    //航空公司
    private String company;
}
