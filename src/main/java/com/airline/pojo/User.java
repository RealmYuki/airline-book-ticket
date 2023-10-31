package com.airline.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:43
 * {@code @Version}  1.0
 */

@Data
@TableName("tbl_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String trueName;

    private String userName;

    private String password;

    private String phone;

    private Integer money;
}
