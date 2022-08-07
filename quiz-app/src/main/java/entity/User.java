package entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {
    private Integer userId;
    private String username;
    private String email;
    private List<Quiz> quizList;
    private List<Result> resultList;
}
