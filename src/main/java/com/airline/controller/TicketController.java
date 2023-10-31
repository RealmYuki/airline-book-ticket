package com.airline.controller;

import com.airline.dto.PassengerDTO;
import com.airline.dto.Result;
import com.airline.pojo.User;
import com.airline.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ClassName: TicketController
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:51
 * {@code @Version}  1.0
 */
@RequestMapping("/ticket")
@Slf4j
@RestController
public class TicketController {

    @Resource
    private TicketService ticketService;

    //根据航班id买票
    @PutMapping("/book/{id}")
    private Result bookTicket(@RequestBody PassengerDTO passenger, @PathVariable("id")Long flightId){
        return ticketService.bookTicket(passenger,flightId);
    }

    //查询某人所有飞机票
    @GetMapping("/user/getById")
    public Result getUserAllTicket(@RequestBody User user){
        return Result.success(ticketService.getAllTicket(user));
    }

    //取消航班
    @DeleteMapping("/user/delete/{id}")
    public Result deleteTicketById(@RequestBody PassengerDTO passenger,@PathVariable("id")Long ticketId){
        ticketService.deleteById(passenger,ticketId);
        return Result.success();
    }
}
