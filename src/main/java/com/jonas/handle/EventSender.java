package com.jonas.handle;

import com.jonas.event.LocalEvent;
import com.jonas.event.MyMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/11/21
 */
@Service
public class EventSender {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void send(Integer time) {
        MyMsg msg = new MyMsg(1L, "Tom", time);
        LocalEvent.builder(publisher)
                .setTopic("myEvent")
                .setContent(msg)
                .publish();
    }

}
