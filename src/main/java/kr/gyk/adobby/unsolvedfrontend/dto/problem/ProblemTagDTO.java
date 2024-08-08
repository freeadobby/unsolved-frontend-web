package kr.gyk.adobby.unsolvedfrontend.dto.problem;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemTagDTO {
    Integer id;
    Integer idBOJ;
    String idSolvedAC;
    String name;
}
