package entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Question {
    private Integer questionId;
    private String question;
    private Answer answer;
    private List<String> options;
}
