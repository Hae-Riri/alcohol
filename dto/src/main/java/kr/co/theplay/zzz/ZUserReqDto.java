package kr.co.theplay.zzz;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ZUserReqDto {

    private Long id;

    private String name;

    private String uid;

    private String phoneNumber;

    private String sex;

    @Builder
    public ZUserReqDto(Long id, String name, String uid, String phoneNumber, String sex){
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }
}
