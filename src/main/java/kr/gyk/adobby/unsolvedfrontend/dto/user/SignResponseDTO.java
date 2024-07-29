package kr.gyk.adobby.unsolvedfrontend.dto.user;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignResponseDTO {
    private Long id;
    private String email;
    private String username;
    private String baekjoonID;
    private List<AuthorityDTO> roles = new ArrayList<>();
    private TokenDTO token;
}
