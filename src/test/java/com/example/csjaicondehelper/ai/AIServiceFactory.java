package com.example.csjaicondehelper.ai;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//标记这是一个 Spring 配置类，用于定义 Bean 的创建逻辑。
@Configuration
public class AIServiceFactory {

//    ChatModel 是一个已有的 Bean（可能是调用大模型的客户端，比如对接 ChatGLM、GPT 的工具类），通过 @Resource 注入到工厂类中。
    @Resource
    private ChatModel chatModel;


//    这个方法的作用是创建 AIService 接口的实例。这里用了 AiServices.create(AIService.class, chatModel) 这种动态代理的方式 —— 不需要手动写 AIService 的实现类，框架会通过动态代理自动生成实现，将接口方法与 chatModel 的能力关联起来。
    @Bean
    public AIService aiService() {
//        只需要创建一个接口，就可以通过aiservice实现接口。动态代理
        return  AiServices.create(AIService.class,chatModel);
    }

    @Bean
    public AIService aiServiceWithChatMemory() {
        return  AiServices.builder(AIService.class)
                .chatModel(chatModel)
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
}
