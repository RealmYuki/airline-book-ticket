package com.airline.service.impl;

import com.airline.dto.FlightPageQueryDTO;
import com.airline.mapper.FlightMapper;
import com.airline.pojo.Flight;
import com.airline.dto.Result;
import com.airline.service.FlightService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: flightService
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 12:48
 * {@code @Version}  1.0
 */
@Service
@Slf4j
public class FlightServiceImpl extends ServiceImpl<FlightMapper, Flight> implements FlightService {

    @Resource
    private FlightMapper flightMapper;

    @Override
    public Result getPage(FlightPageQueryDTO flightPageQueryDTO) {
        QueryWrapper<Flight> queryWrapper = new QueryWrapper<>();
        IPage<Flight> page = new Page<>(flightPageQueryDTO.getPage(), flightPageQueryDTO.getPageSize());
        if (flightPageQueryDTO.getStart() != null) {
            queryWrapper.like("start", flightPageQueryDTO.getStart());
        }
        if (flightPageQueryDTO.getEnd()!=null){
            queryWrapper.like("end",flightPageQueryDTO.getEnd());
        }
        if (flightPageQueryDTO.getDate()!=null){
            queryWrapper.like("date",flightPageQueryDTO.getDate());
        }


        queryWrapper.orderByAsc(flightPageQueryDTO.getOrder());
        IPage<Flight> flightIPage = flightMapper.selectPage(page, queryWrapper);
        return Result.success(flightIPage);
    }
}
