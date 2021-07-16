package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

//grade for a certain student
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Grade {
    private double avg; // all tests
    private Map<String, Integer> examsScore; // <examName, score>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Double.compare(grade.avg, avg) == 0 && Objects.equals(examsScore, grade.examsScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, examsScore);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "avg=" + avg +
                ", examsScore=" + examsScore +
                '}';
    }

    abstract double calculateAvg();

    private Integer addEntry(String name, Integer score){
        return examsScore.put(name, score);
    }

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract Integer getScore(String examName);

    abstract void emptyAll();

}
