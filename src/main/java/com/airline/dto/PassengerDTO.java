package com.airline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: UserDTO
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 15:19
 * {@code @Version}  1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDTO {

    //临时变量
    private Long id;


    private Integer seatPreference;


}
