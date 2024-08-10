package kr.gyk.adobby.unsolvedfrontend.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {

    Long id;
    Long problemId;
    String subject;
    String content;
    String Tag;
}
