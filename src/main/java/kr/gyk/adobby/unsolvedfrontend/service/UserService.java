package kr.gyk.adobby.unsolvedfrontend.service;

import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import kr.gyk.adobby.unsolvedfrontend.dto.user.SignResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    public SignResponseDTO postUserObject(final SignRequestDTO dto){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://unsolved.adobby.gyk.kr/user"; //유저 정보 있는 url 있으면 될거같음

        return restTemplate.postForObject(
                url,
                dto,
                SignResponseDTO.class
        );
    }
}
