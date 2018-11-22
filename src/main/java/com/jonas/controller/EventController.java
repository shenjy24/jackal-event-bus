package com.jonas.controller;

import com.jonas.handle.EventSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/11/21
 */
@RestController
public class EventController {

    @Autowired
    private EventSender sender;

    @PostMapping("/sendEvent")
    public void sendEvent(Integer time, Integer count) {
        for (int i = 0; i <= count; i++) {
            sender.send(time);
        }
        System.out.println(time + ":success");
    }
}
