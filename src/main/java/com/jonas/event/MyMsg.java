package com.jonas.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/11/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyMsg {
    private Long id;
    private String msg;
    private Integer sleepTime;
}
