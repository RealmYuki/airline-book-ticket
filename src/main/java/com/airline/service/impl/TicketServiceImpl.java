package com.airline.service.impl;

import com.airline.dto.PassengerDTO;
import com.airline.dto.Result;
import com.airline.mapper.FlightMapper;
import com.airline.mapper.TicketMapper;
import com.airline.mapper.UserMapper;
import com.airline.pojo.Flight;
import com.airline.pojo.Ticket;
import com.airline.pojo.User;
import com.airline.service.FlightService;
import com.airline.service.TicketService;
import com.airline.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.sf.jsqlparser.util.validation.metadata.NamedObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static net.sf.jsqlparser.util.validation.metadata.NamedObject.user;

/**
 * ClassName: TicketServiceImpl
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:56
 * {@code @Version}  1.0
 */
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {

    @Resource
    private UserService userService;

    @Resource
    private TicketMapper ticketMapper;
    @Resource
    private FlightService flightService;

    @Override
    @Transactional
    public Result bookTicket(PassengerDTO passenger, Long flightId) {
        //TODO:还需查询是否买过
        Flight flight = flightService.getById(flightId);
        Long id = passenger.getId();
        Integer price = flight.getPrice();
        User user = userService.getById(id);
        if (user.getMoney()<price){
            return Result.error("你的余额不足");
        }
        if(flight.getNumber()<=0){
            return Result.error("座位不足");
        }
        user.setMoney(user.getMoney()-price);
        flight.setNumber(flight.getNumber()-1);
        userService.updateById(user);
        flightService.updateById(flight);
        Ticket ticket = new Ticket(id,flightId,passenger.getSeatPreference(),user.getTrueName(),user.getPhone());
        this.save(ticket);
        return Result.success();
    }

    @Override
    public Result getAllTicket(User user) {
        List<Ticket> tickets = ticketMapper.selectByUserId(user.getId());
        return Result.success(tickets);
    }

    @Override
    @Transactional
    public Result deleteById(PassengerDTO passenger,Long ticketId) {
        //可能还需要做登录校验，这里放弃
        Long id = passenger.getId();
        User user = userService.getById(id);
        Ticket ticket = getById(ticketId);
        Long flightId = ticket.getFlightId();
        Flight flight = flightService.getById(flightId);
        user.setMoney(user.getMoney()+flight.getPrice());
        flight.setNumber(flight.getNumber()+1);
        userService.updateById(user);
        flightService.updateById(flight);
        return Result.success(removeById(ticketId));
    }


}
