package kr.co.theplay;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class AbstractControllerTest {

    @Autowired
    public MockMvc mockMvc;

    @Autowired
    public ObjectMapper objectMapper;
}
