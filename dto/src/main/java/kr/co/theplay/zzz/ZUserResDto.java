package kr.co.theplay.zzz;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ZUserResDto {

    private Long id;

    private String name;

    private String phoneNumber;

    @Builder
    public ZUserResDto(Long id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
