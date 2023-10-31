package com.airline.service.impl;

import com.airline.dto.Result;
import com.airline.mapper.UserMapper;
import com.airline.pojo.User;
import com.airline.service.TicketService;
import com.airline.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: UserService
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 15:09
 * {@code @Version}  1.0
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
