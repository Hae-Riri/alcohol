package kr.co.theplay.zzz;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ZUserSingleResDto {

    @ApiModelProperty(value = "uid", dataType = "String", required = true, example = "ehl3288@naver.com")
    private String uid;

    @ApiModelProperty(value = "phoneNumber", dataType = "String", required = true, example = "010-5768-5933")
    private String phoneNumber;

    @Builder
    public ZUserSingleResDto(String uid, String phoneNumber){
        this.uid  = uid;
        this.phoneNumber = phoneNumber;
    }
}
