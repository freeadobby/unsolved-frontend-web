package kr.gyk.adobby.unsolvedfrontend.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class QuestionForm {
    Long id;
    Long problemId;
    String subject;
    String content;
    String writer;
    String tag;
    LocalDateTime createTime;
    List<AnswerForm> answers;
}
