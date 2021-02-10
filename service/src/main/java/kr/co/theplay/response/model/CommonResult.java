package kr.co.theplay.response.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {

    private boolean success;

    private int code;

    private String msg;
}
