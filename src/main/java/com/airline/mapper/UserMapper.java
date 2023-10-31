package com.airline.mapper;

import com.airline.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 15:08
 * {@code @Version}  1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
