package kr.co.theplay.common;

import kr.co.theplay.common.model.SingleResult;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class CommonApiService {

    private ResponseService responseService;
    private MessageSource messageSource;

    public CommonApiService(ResponseService responseService, MessageSource messageSource){
        this.responseService = responseService;
        this.messageSource = messageSource;
    }

}
