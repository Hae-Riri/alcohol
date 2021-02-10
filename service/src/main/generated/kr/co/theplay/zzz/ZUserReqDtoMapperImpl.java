package kr.co.theplay.zzz;

import javax.annotation.Generated;
import kr.co.theplay.zzz.ZUser.ZUserBuilder;
import kr.co.theplay.zzz.ZUserReqDto.ZUserReqDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-10T17:05:36+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_191-1-ojdkbuild (Oracle Corporation)"
)
public class ZUserReqDtoMapperImpl implements ZUserReqDtoMapper {

    @Override
    public ZUser toEntity(ZUserReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ZUserBuilder zUser = ZUser.builder();

        zUser.id( arg0.getId() );
        zUser.name( arg0.getName() );
        zUser.uid( arg0.getUid() );
        zUser.phoneNumber( arg0.getPhoneNumber() );
        zUser.sex( arg0.getSex() );

        return zUser.build();
    }

    @Override
    public ZUserReqDto toDto(ZUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ZUserReqDtoBuilder zUserReqDto = ZUserReqDto.builder();

        zUserReqDto.id( arg0.getId() );
        zUserReqDto.name( arg0.getName() );
        zUserReqDto.uid( arg0.getUid() );
        zUserReqDto.phoneNumber( arg0.getPhoneNumber() );
        zUserReqDto.sex( arg0.getSex() );

        return zUserReqDto.build();
    }
}
