package kr.gyk.adobby.unsolvedfrontend.dto.user;

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
