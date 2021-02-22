package kr.co.theplay.zzz;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserListResDto {

    @ApiModelProperty(value = "아이디", dataType ="Long", required = true, example = "1")
    private Long id;

    @ApiModelProperty(value = "이름", dataType = "String", required = true, example = "어해림")
    private String name;

    @Builder
    public UserListResDto(Long id, String name){
        this.id = id;
        this.name = name;
    }

}
