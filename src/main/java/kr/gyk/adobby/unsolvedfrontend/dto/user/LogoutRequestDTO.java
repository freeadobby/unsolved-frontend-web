package kr.gyk.adobby.demo.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LogoutRequestDTO {
    private String email;
    private String accessToken;
}
