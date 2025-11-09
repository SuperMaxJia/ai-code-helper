package com.example.csjaicondehelper.ai;

import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeHelperTest {

    @Resource
    private AiCodeHelper aiCodeHelper;

    @Test
    void getAiCode() {
        aiCodeHelper.check("你好");
    }

    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://image.baidu.com/search/detail?ct=503316480&z=0&tn=baiduimagedetail&ipn=d&cl=2&cm=1&sc=0&sa=vs_ala_img_datu&lm=-1&ie=utf8&pn=1&rn=1&di=7552572858984038401&ln=0&word=图片壁纸&os=3041539971%2C811271123&cs=2199543669%2C914100367&objurl=http%3A%2F%2Fwx2.sinaimg.cn%2Fmw690%2F9db6e045gy1hwgmduvb74j20zu25o7bp.jpg&bdtype=0&simid=3386002622%2C489811393&pi=0&adpicid=0&timingneed=&spn=0&is=0%2C0&lid=ce3af592000602e0")
        );
        aiCodeHelper.chatWithMessage(userMessage);
    }
}