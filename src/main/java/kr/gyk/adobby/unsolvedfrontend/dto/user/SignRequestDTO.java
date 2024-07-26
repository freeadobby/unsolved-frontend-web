package kr.gyk.adobby.unsolvedfrontend.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignRequestDTO {
    private Long id;
    private String email;
    private String username;
    private String password;
    private String baekjoon;
}
