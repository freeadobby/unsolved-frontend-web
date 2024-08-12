package kr.gyk.adobby.unsolvedfrontend.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerForm {
    Long id;
    String content;
    String writer;
    LocalDateTime createTime;
    QuestionForm questionForm;
}
