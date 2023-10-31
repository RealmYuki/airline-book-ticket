package com.airline.mapper;

import com.airline.pojo.Flight;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: FlightMapper
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 13:00
 * {@code @Version}  1.0
 */
@Mapper
public interface FlightMapper extends BaseMapper<Flight> {
}
