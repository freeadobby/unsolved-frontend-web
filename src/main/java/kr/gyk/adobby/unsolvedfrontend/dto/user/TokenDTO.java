package kr.gyk.adobby.unsolvedfrontend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {
    private String accessToken;
    private String refreshToken;
}
