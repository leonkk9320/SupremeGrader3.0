package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {
    private String description;
    private List<String> options;
    private String answer;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(description, question.description) && Objects.equals(options, question.options) && Objects.equals(answer, question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, options, answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", options=" + options +
                ", answer='" + answer + '\'' +
                '}';
    }
}
