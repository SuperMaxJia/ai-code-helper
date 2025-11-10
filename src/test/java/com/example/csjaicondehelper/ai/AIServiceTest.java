package com.example.csjaicondehelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AIServiceTest {
    @Resource
    @Qualifier("aiService")
    private AIService aiService;

    @Resource
    @Qualifier("aiServiceWithChatMemory")
    private AIService aiServiceWithChatMemory;

    @Test
    void addTest() {
        System.out.println(aiService.chat("怎么计算a+b"));
    }

    @Test
    void chatTest() {
        System.out.println(aiServiceWithChatMemory.chat("today is 2028-10-11"));
        System.out.println(aiServiceWithChatMemory.chat("what day?"));
    }


    @Test
    void dealPersonInfoMation() {
        System.out.println(aiService.dealPersonInfoMation("我叫崔思佳，出生于1997年"));
    }
}