package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Subject {
    private int subjectID;
    private String subjectName;
    private String info;
    private List<Student> studentGroup;
    private Teacher teacher;
    private List<Question> questionList;

    abstract void addQuestion();

    abstract void dropQuestion();



}
