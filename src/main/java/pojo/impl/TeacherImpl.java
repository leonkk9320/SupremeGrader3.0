package pojo.impl;

import pojo.Subject;
import pojo.Teacher;

import java.util.List;

public class TeacherImpl extends Teacher {
    private List<Subject> teachingSubject = super.getTeachingSubject();

    @Override
    public void addSubject(Subject subject) {
        teachingSubject.add(subject);
    }

    @Override
    public void dropSubject(int index) {
        teachingSubject.remove(index);
    }
}
