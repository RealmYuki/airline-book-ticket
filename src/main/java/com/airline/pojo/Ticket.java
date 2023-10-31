package com.airline.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Tickets
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 14:48
 * {@code @Version}  1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_ticket")
public class Ticket {

    private Long id;

    private Long userId;

    private Long flightId;

    private Integer seatPreference;

    private String trueName;

    private String phone;


    public Ticket(Long userId, Long flightId, Integer seatPreference, String trueName, String phone) {
        this.userId = userId;
        this.flightId = flightId;
        this.seatPreference = seatPreference;
        this.trueName = trueName;
        this.phone = phone;
    }


}
