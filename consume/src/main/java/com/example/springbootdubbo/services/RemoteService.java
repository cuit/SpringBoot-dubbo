package com.example.springbootdubbo.services;

import org.springframework.stereotype.Component;

/**
 * @author: XSC
 * @date: 2018/4/10 下午7:14
 */
@Component
public interface RemoteService {

    Integer add(int a, int b);
}
