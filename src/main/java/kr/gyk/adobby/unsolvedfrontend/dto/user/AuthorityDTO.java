package kr.gyk.adobby.unsolvedfrontend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDTO {
    private Long id;
    private String name;
}
