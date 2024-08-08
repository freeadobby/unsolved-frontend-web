package kr.gyk.adobby.unsolvedfrontend;

import kr.gyk.adobby.unsolvedfrontend.controller.LoginController;
import kr.gyk.adobby.unsolvedfrontend.controller.UserController;
import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import kr.gyk.adobby.unsolvedfrontend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnSolvedFrontendApplicationTests {

    @Autowired
    private UserService userService;

	@Test
	void contextLoads() {
		LoginController loginController = new LoginController(userService);

		SignRequestDTO signRequestDTO = SignRequestDTO.builder()
				.email("qogusgh0405@naver.com")
				.password("12345678")
				.username("배현호")
				.baekjoon("qogusgh0405")
				.build();

		//loginController.registerPost(signRequestDTO);
	}

}
