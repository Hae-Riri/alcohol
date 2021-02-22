package kr.co.theplay.zzz;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import kr.co.theplay.common.ResponseService;
import kr.co.theplay.common.model.CommonResult;
import kr.co.theplay.common.model.ListResult;
import kr.co.theplay.common.model.SingleResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"999. ZZZ (예시 API)"})
@RequestMapping(value = "/api")
@Slf4j(topic = "ZZZ Logger")
@RequiredArgsConstructor
@RestController
public class ZUserController {

    private final ResponseService responseService;
    private final ZUserService zUserService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "회원 추가", notes = "새로운 회원을 추가한다.")
    @PostMapping(value = "/user")
    public ResponseEntity<CommonResult> saveZUser(@RequestBody ZUserReqDto zUserReqDto) {
        zUserService.saveZUser(zUserReqDto);
        return new ResponseEntity<>(responseService.getSuccessResult(), HttpStatus.OK);
    }

    @ApiOperation(value = "회원 목록 조회", notes = "모든 회원을 조회한다.")
    @GetMapping(value = "/user")
    public ResponseEntity<ListResult<UserListResDto>> getAllUser(){
        List<UserListResDto> userListResDtoList =  zUserService.getAllUser();
        ListResult<UserListResDto> resDtoListResult = responseService.getListResult(userListResDtoList);
        return new ResponseEntity<>(resDtoListResult, HttpStatus.OK);
    }

    @ApiOperation(value = "id로 회원 조회", notes = "id로 회원을 조회한다.")
    @GetMapping(value = "/user/{id}")
    public ResponseEntity<SingleResult<ZUserSingleResDto>> getUserById(@PathVariable Long id){
        ZUserSingleResDto zUserSingleResDto = zUserService.getUserById(id);
        SingleResult<ZUserSingleResDto> result = responseService.getSingleResult(zUserSingleResDto);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "id로 회원정보 수정", notes = "id를 받아서 회원 정보를 수정한다.")
    @PutMapping(value = "/user/{id}")
    public ResponseEntity<CommonResult> updateUserById(@PathVariable Long id, @RequestBody ZUserUpdateReqDto zUserUpdateReqDto){
        zUserService.updateUserById(id, zUserUpdateReqDto);
        return new ResponseEntity<>(responseService.getSuccessResult(), HttpStatus.OK);
    }

    @ApiModelProperty(value = "id 로 회원삭제", notes = "id를 받아서 회원을 삭제한다.")
    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<CommonResult> deleteUserById(@PathVariable Long id){
        zUserService.deleteUserById(id);
        return new ResponseEntity<>(responseService.getSuccessResult(), HttpStatus.OK);
    }
}
