package com.example.springbootdubbo.services;

/**
 * @author: XSC
 * @date: 2018/4/10 下午5:03
 */
public class RemoteServiceImpl implements RemoteService {
    @Override
    public Integer add(int a, int b) {
        return a + b;
    }
}
