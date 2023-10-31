package com.airline.mapper;

import com.airline.pojo.Ticket;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: TicketMapper
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:56
 * {@code @Version}  1.0
 */
@Mapper
public interface TicketMapper extends BaseMapper<Ticket> {
    @Select("select * from tbl_ticket where user_id = #{id}")
    List<Ticket> selectByUserId(Long id);

//    @Select("select start, end, date, price, start_time, end_time,company" +
//            ",t.id,t.seat_preference from ticket t " +
//            "left join flight f on f.id = t.id where t.user_id = #{id}")
//    List<Ticket> selectByUserId(Long id);
}
