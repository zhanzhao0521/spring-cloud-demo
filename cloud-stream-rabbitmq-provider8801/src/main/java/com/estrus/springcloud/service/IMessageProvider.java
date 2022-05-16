package com.estrus.springcloud.service;

import org.springframework.cloud.stream.annotation.Output;

public interface IMessageProvider {
    @Output()
    public String send();
}
