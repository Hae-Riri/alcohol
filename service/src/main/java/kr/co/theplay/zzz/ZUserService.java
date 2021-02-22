package kr.co.theplay.zzz;

import kr.co.theplay.common.CommonApiService;
import kr.co.theplay.common.ResponseService;
import kr.co.theplay.common.model.ListResult;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
public class ZUserService extends CommonApiService {

    private final ZUserRepository zUserRepository;

    @Builder
    public ZUserService(ResponseService responseService, MessageSource messageSource,
                        ZUserRepository zUserRepository){
        super(responseService, messageSource);
        this.zUserRepository = zUserRepository;
    }

    @Transactional
    public void saveZUser(ZUserReqDto zUserReqDto) {
        ZUser zUser = ZUserReqDtoMapper.INSTANCE.toEntity(zUserReqDto);
        zUserRepository.save(zUser);
    }

    public List<UserListResDto> getAllUser() {
        List<ZUser> zUsers = zUserRepository.findAll();
        List<UserListResDto> resDtos = zUsers.stream().map(UserListResDtoMapper.INSTANCE::toDto).collect(Collectors.toList());
        return resDtos;
    }

    public ZUserSingleResDto getUserById(Long id) {
        ZUser zUser = zUserRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id : "+id));
        ZUserSingleResDto zUserSingleResDto = ZUserSingleResDtoMapper.INSTANCE.toDto(zUser);
        return zUserSingleResDto;
    }

    @Transactional
    public void updateUserById(Long id, ZUserUpdateReqDto zUserUpdateReqDto) {
        ZUser zUser = zUserRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시물이 없어요. id + "+ id));
        zUser.updateUser(zUserUpdateReqDto.getName(), zUserUpdateReqDto.getPhoneNumber());
    }

    @Transactional
    public void deleteUserById(Long id) {
        ZUser zUser = zUserRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시물이 없어요. id + "+ id));
        zUserRepository.delete(zUser);
    }
}
