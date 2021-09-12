package ecobaby.ecobaby;

import ecobaby.ecobaby.controller.MemberController;
import ecobaby.ecobaby.domain.HTTPStatusCode;
import ecobaby.ecobaby.domain.LoginInfo;
import ecobaby.ecobaby.domain.Member;
import ecobaby.ecobaby.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class EcobabyApplicationTests {

    @Autowired
    private MemberController memberController;
    @Autowired
    private MemberRepository memberRepository;

//     /*
//         로그인 성공
//      */
//     @Test
//     public void 로그인성공(){
//         //given
//         LoginInfo loginInfo = new LoginInfo("auto33","dfaib31");
//         //when
//         HTTPStatusCode httpStatusCode = memberController.login(loginInfo);
//         //then
//         System.out.println("httpStatusCode.getMessage() = " + httpStatusCode.getMessage() + "\n");
//         assertThat(httpStatusCode.getStatus()).isEqualTo(200);
//     }
//     /*
//         로그인 실패
//      */
//     @Test
//     public void 로그인실패(){
//         //given
//         LoginInfo loginInfo = new LoginInfo("auto33","zzaefadga");
//         //when
//         HTTPStatusCode httpStatusCode = memberController.login(loginInfo);
//         //then
//         System.out.println("httpStatusCode.getMessage() = " + httpStatusCode.getMessage() + "\n");
//         assertThat(httpStatusCode.getStatus()).isEqualTo(400);
//     }
//     /*
//         회원가입성공
//     */
//     @Test
//     public void 회원가입성공(){
//         //given
//         LoginInfo loginInfo = new LoginInfo("zzzzzzz","zzzzzz");
//         //when
//         HTTPStatusCode httpStatusCode = memberController.signup(loginInfo);
//         //then
//         System.out.println("httpStatusCode.getMessage() = " + httpStatusCode.getMessage() + "\n");
//         assertThat(httpStatusCode.getStatus()).isEqualTo(200);
//     }
//     /*
//         회원가입실패
//      */
//     @Test
//     public void 회원가입실패(){
//         //given
//         LoginInfo loginInfo = new LoginInfo("auto33","zzzzzz");
//         //when
//         HTTPStatusCode httpStatusCode = memberController.signup(loginInfo);
//         //then
//         System.out.println("httpStatusCode.getMessage() = " + httpStatusCode.getMessage() + "\n");
//         assertThat(httpStatusCode.getStatus()).isEqualTo(400);
//     }

//     @Test
//     public void 점수업데이트(){
//         Member member = new Member("auto31", "dfaib31", 100);
//         memberController.score_update(member);
//         Member result = memberRepository.findById("auto31");
//         assertThat(100).isEqualTo(result.getScore());

//     }
}
