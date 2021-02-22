package kr.co.theplay.zzz;

import kr.co.theplay.MapStructMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ZUserSingleResDtoMapper extends MapStructMapper<ZUserSingleResDto, ZUser> {
    ZUserSingleResDtoMapper INSTANCE = Mappers.getMapper(ZUserSingleResDtoMapper.class);
}
