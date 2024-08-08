package kr.gyk.adobby.unsolvedfrontend.service;

import kr.gyk.adobby.unsolvedfrontend.dto.problem.ProblemDetailListDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProblemService {

    public ProblemDetailListDTO getProblem() {
        // WebClient는 Builder 패턴 처럼 사용
        WebClient webClient = WebClient.create("http://localhost:8080");

        // 어떤 HTTP 메소드로 요청 보낼지를 get(), post() 메소드 등으로 결정
        // 만일 다른 메소드를 쓰고 싶다면, method()
        return webClient.get() // webClient.method(HttpMethod.GET)
                .uri(uriBuilder -> uriBuilder.path("/v1/userProblem")
                        .queryParam("email", "")
                        .build())
                .retrieve()	// 여기 전까지가 요청을 정의 한 부분
                // 여기부터 정의하는건 응답을 어떻게 처리할 것인지
                .bodyToMono(ProblemDetailListDTO.class)
                .block();	// 동기식으로 처리
    }
}
