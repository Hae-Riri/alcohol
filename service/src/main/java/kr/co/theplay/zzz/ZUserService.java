package kr.co.theplay.zzz;

import kr.co.theplay.common.CommonApiService;
import kr.co.theplay.common.ResponseService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
