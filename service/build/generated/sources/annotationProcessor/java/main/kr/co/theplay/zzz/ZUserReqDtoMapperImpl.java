package kr.co.theplay.zzz;

import javax.annotation.Generated;
import kr.co.theplay.zzz.ZUser.ZUserBuilder;
import kr.co.theplay.zzz.ZUserReqDto.ZUserReqDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-22T14:42:46+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_191-1-ojdkbuild (Oracle Corporation)"
)
public class ZUserReqDtoMapperImpl implements ZUserReqDtoMapper {

    @Override
    public ZUser toEntity(ZUserReqDto dto) {
        if ( dto == null ) {
            return null;
        }

        ZUserBuilder zUser = ZUser.builder();

        zUser.name( dto.getName() );
        zUser.uid( dto.getUid() );
        zUser.phoneNumber( dto.getPhoneNumber() );
        zUser.sex( dto.getSex() );

        return zUser.build();
    }

    @Override
    public ZUserReqDto toDto(ZUser entity) {
        if ( entity == null ) {
            return null;
        }

        ZUserReqDtoBuilder zUserReqDto = ZUserReqDto.builder();

        zUserReqDto.name( entity.getName() );
        zUserReqDto.uid( entity.getUid() );
        zUserReqDto.phoneNumber( entity.getPhoneNumber() );
        zUserReqDto.sex( entity.getSex() );

        return zUserReqDto.build();
    }
}
