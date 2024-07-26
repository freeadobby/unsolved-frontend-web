package kr.gyk.adobby.unsolvedfrontend.dto.problem;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ProblemRequestListDTO {
    private List<Long> problemIds;
}
