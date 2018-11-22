/*
 * Copyright (C) 2016  HangZhou YuShi Technology Co.Ltd  Holdings Ltd. All rights reserved
 *
 * 本代码版权归杭州宇石科技所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.jonas.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * message事件
 *
 * @version 
 * @author liuyi  2017年4月18日 下午11:30:34
 * 
 */
@Component
public class LocalEvent {
    private ApplicationEventPublisher publisher;
    private String topic;
    private Object content;

    public static LocalEvent builder(ApplicationEventPublisher publisher) {
        LocalEvent localEvent = new LocalEvent();
        localEvent.setPublisher(publisher);
        return localEvent;
    }

    public LocalEvent setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public LocalEvent setContent(Object content) {
        this.content = content;
        return this;
    }

    private void setPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        publisher.publishEvent(this);
    }

    public String getTopic() {
        return topic;
    }

    public Object getContent() {
        return content;
    }

}
