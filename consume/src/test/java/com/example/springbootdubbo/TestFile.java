package com.example.springbootdubbo;

import com.example.springbootdubbo.services.RemoteService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: XSC
 * @date: 2018/4/10 下午5:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFile {

    @Autowired
    RemoteService remoteService;

    @Test
    public void add(){
        Assert.assertEquals("remote-service:add", new Integer(3), remoteService.add(1, 2));
    }
}
