package kr.co.theplay;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class AbstractControllerTest {

    //@Autowired는 주입하려는 객체의 타입과 일치하는 객체를 new 없이 자동으로 생성해서 자동으로 주입해준다.
    @Autowired
    public MockMvc mockMvc;

    @Autowired
    public ObjectMapper objectMapper;
}
