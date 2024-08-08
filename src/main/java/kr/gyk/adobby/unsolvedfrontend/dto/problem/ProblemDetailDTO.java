package kr.gyk.adobby.unsolvedfrontend.dto.problem;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDetailDTO {
    Long id;
    String title;
    Long acceptedUserCount;
    Boolean isSprout;
    Integer levelCustom;
    Integer levelSolvedAC;
    ArrayList<ProblemTagDTO> tags;
}
