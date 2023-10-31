package com.airline.service;

import com.airline.dto.FlightPageQueryDTO;
import com.airline.pojo.Flight;
import com.airline.dto.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * ClassName: flightService
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 12:49
 * {@code @Version}  1.0
 */
public interface FlightService extends IService<Flight> {


    Result getPage(FlightPageQueryDTO flightPageQueryDTO);
}
