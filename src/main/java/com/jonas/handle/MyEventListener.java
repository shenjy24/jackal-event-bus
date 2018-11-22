package com.jonas.handle;

import com.jonas.event.LocalEvent;
import com.jonas.event.MyMsg;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/11/21
 */
@Component
public class MyEventListener {

    @Async
    @EventListener(condition = "#event.topic=='myEvent'")
    public void onEvent(LocalEvent event) {
        MyMsg msg = (MyMsg) event.getContent();
        try {
            Thread.sleep(msg.getSleepTime());
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }
}
