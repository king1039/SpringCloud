package com.example.register2.client.impl;

import com.example.register2.client.BaseClient;
import org.springframework.stereotype.Component;

@Component
public class BaseClientImpl implements BaseClient {
    @Override
    public String findById(String labelId) {
        System.out.println("熔断器触发了");
        return "success";
    }
}
