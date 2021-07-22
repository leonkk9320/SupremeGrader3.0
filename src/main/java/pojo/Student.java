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
public abstract class Student extends Person {
    private int studentID;
    private Grade grade;
    private List<String> learningSubject;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(grade, student.grade) && Objects.equals(learningSubject, student.learningSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentID, grade, learningSubject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", grade=" + grade +
                ", learningSubject=" + learningSubject +
                '}';
    }

    public abstract void addSubject(String name);

    public abstract void dropSubject(String name);

    //grade related methods

    public abstract double queryAvg();

    public abstract Integer queryScoreByExam(String examName);

    public abstract Integer addEntry(String name, Integer score);

    public abstract Integer deleteEntry(String name);

    public abstract void modifyEntry(String examName, Integer score);

    public abstract void emptyAll();
}
