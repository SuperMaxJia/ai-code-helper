package com.example.csjaicondehelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AIServiceTest {
    @Resource
    private AIService aiService;

    @Test
    void addTest() {
        System.out.println(aiService.chat("怎么计算a+b"));
    }

}