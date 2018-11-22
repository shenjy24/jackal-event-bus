package com.jonas;

import com.jonas.handle.EventSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/11/21
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private EventSender sender;

    @Test
    public void testSend() {
        sender.send(1);
    }
}
