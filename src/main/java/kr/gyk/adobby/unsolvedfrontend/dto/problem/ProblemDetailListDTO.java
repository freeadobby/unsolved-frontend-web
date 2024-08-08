package kr.gyk.adobby.unsolvedfrontend.dto.problem;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDetailListDTO {
    Long count;
    ArrayList<ProblemDetailDTO> problemList;
}
