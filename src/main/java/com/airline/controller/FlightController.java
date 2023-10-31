package com.airline.controller;

import com.airline.dto.FlightPageQueryDTO;
import com.airline.pojo.Flight;
import com.airline.dto.Result;
import com.airline.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: flightController
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 12:48
 * {@code @Version}  1.0
 */

@RequestMapping("/flight")
@Slf4j
@RestController
public class FlightController {
    @Resource
    private FlightService flightService;

    @GetMapping("/list")
    public Result getAll(){
        List<Flight> flights = flightService.list();
        return Result.success(flights);
    }

    @GetMapping("/page")//通过出发地，目的地，日期查询航班并分页排序
    public Result getPage(@RequestBody FlightPageQueryDTO flightPageQueryDTO){
        return Result.success(flightService.getPage(flightPageQueryDTO));
    }

    @PutMapping("/insert")
    public Result insert(@RequestBody Flight flight){
        flightService.save(flight);
        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Flight flight){
        flightService.updateById(flight);
        return Result.success();
    }
}
