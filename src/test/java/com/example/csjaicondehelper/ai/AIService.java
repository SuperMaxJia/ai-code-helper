package com.example.csjaicondehelper.ai;

import dev.langchain4j.service.SystemMessage;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

public interface AIService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String message);
}
