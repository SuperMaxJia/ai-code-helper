package com.example.csjaicondehelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AiCodeHelper  {
    @Resource
    private ChatModel qwenChatModel;

    /**
     * 简单对话
     * @param text
     * @return
     */
    public String check(String text) {
        UserMessage userMessage = UserMessage.from(text);
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI 输出："+aiMessage.toString());
        return aiMessage.text();
    }

    /**
     * 自定义用户小熊
     * @param userMessage
     * @return
     */
    public String chatWithMessage(UserMessage userMessage) {
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI 输出："+aiMessage.toString());
        return aiMessage.text();
    }
}
