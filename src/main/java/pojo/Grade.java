package pojo;
import java.util.*;
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
    
    public Grade{
    	examsScore = new Map<String, Integer>();
    	avg = 0.0;
    }
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

    abstract public double calculateAvg() {
    	double a = 0;
    	for(Map.Entry<String, Integer> entry:examsScore.entrySet()) {
    		a+=entry.getValue()
    	}
    	a = (a/examsScore.size());
    	return a;
    }

    private Integer addEntry(String name, Integer score){
        return examsScore.put(name, score);
    }

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract double getScore(String examName) {
    	for(Map.Entry<String, Integer> entry:examsScore.entrySet()) {
    		if(Entry.getKey() == examName) {
    			return Entry.getValue();
    		}
    	}
    }

    abstract void emptyAll();

}
