package com.example.csjaicondehelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIServiceFactory {
    @Resource
    private ChatModel chatModel;


    @Bean
    public AIService aiService() {
//        只需要创建一个接口，就可以通过aiservice实现接口。动态代理
        return  AiServices.create(AIService.class,chatModel);
    }
}
