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

    abstract void addSubject();

    abstract void dropSubject();

    //grade related methods

    abstract void queryAvg();

    abstract void queryScoreByExam(String examName);

    abstract Integer addEntry(String name, Integer score);

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract void emptyAll();
}
