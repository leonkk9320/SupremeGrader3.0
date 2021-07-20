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
    
    
    public Student{
    	studentID = 0;
    	learningSubject = new ArrayList<String>(); 
    }

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

    abstract void addSubject(String subname) {
    	int a=0;
    	for(String temp: learningSubject) {
    		if(temp.equals(subname)) {
    			a+=1;
    		}
    	}
    	if(a>0) {
    		System.out.println("Already have this course!")
    	}
    	else {
    		learningSubject.add(subname);
    	}   
    }

    abstract void dropSubject(String subname) {
       	for(String temp: learningSubject) {
    		if(temp.equals(subname)) {
    			learningSubject.remove(temp);
    		}
    	}
    }

    //grade related methods

    abstract void queryAvg();

    abstract void queryScoreByExam(String examName);

    abstract Integer addEntry(String name, Integer score);

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract void emptyAll();
}
