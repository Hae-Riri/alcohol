package kr.co.theplay.zzz;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ZUserUpdateReqDto {

    @ApiModelProperty(value = "이름", dataType = "String", required = true, example = "김땡")
    private String name;

    @ApiModelProperty(value = "이름", dataType = "String", required = true, example = "010-1234-1234")
    private String phoneNumber;

    @Builder
    public ZUserUpdateReqDto(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
