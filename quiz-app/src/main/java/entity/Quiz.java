package entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Quiz {
    private Integer quizId;
    private String quizName;
    private List<Question> questionList;
    private String quizDuration;
}
