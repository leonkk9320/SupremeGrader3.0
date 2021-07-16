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
public abstract class Teacher {
    private int teacherID;
    private List<Subject> teachingSubject;

    abstract void addSubject();

    abstract void dropSubject();




}
