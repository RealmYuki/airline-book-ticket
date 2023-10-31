package com.airline.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightPageQueryDTO implements Serializable {//继承可序列化接口

    //出发地
    private String start;
    //目的地
    private String end;
    //出发日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    //排序方式
    private String order;
    //页码
    private int page;
    //每页显示记录数
    private int pageSize;

}
