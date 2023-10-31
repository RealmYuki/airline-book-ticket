package com.airline.service;

import com.airline.dto.PassengerDTO;
import com.airline.dto.Result;
import com.airline.pojo.Ticket;
import com.airline.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * ClassName: TicketService
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:55
 * {@code @Version}  1.0
 */
public interface TicketService extends IService<Ticket> {
    Result bookTicket(PassengerDTO passenger, Long flightId);

    Result getAllTicket(User user);

    Result deleteById(PassengerDTO passenger,Long ticketId);
}
