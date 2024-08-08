package kr.gyk.adobby.unsolvedfrontend.service;

import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import kr.gyk.adobby.unsolvedfrontend.dto.user.SignResponseDTO;
import kr.gyk.adobby.unsolvedfrontend.form.LoginForm;
import kr.gyk.adobby.unsolvedfrontend.form.RegisterForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    public void login(final LoginForm loginForm) {
        WebClient webClient = WebClient.builder().build();
        String url = "https://localhost:8080/v1/user/login";

        SignRequestDTO dto = SignRequestDTO.builder()
                .email(loginForm.getEmail())
                .password(loginForm.getPassword())
                .build();

        // POST 요청
        SignResponseDTO responseBody = webClient.post()
                .uri(url)	// url 정의
                .bodyValue(dto)	// requestBody 정의
                .retrieve()	// 응답 정의 시작
                .bodyToMono(SignResponseDTO.class)	// 응답 데이터 정의
                .block();	// 동기식 처리

        log.info(responseBody.toString());
    }

    public void register(final RegisterForm registerForm){
        WebClient webClient = WebClient.builder().build();
        String url = "https://localhost:8080/v1/user";

        SignRequestDTO dto = SignRequestDTO.builder()
                .email(registerForm.getEmail())
                .username(registerForm.getUsername())
                .password(registerForm.getPassword())
                .baekjoon(registerForm.getBaekjoon())
                .build();

        // POST 요청
        SignResponseDTO responseBody = webClient.post()
                .uri(url)	// url 정의
                .bodyValue(dto)	// requestBody 정의
                .retrieve()	// 응답 정의 시작
                .bodyToMono(SignResponseDTO.class)	// 응답 데이터 정의
                .block();	// 동기식 처리

        log.info(responseBody.toString());

    }


}
