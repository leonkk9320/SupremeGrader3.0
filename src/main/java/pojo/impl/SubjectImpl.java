package pojo.impl;

import pojo.Question;
import pojo.Subject;

import java.util.List;

public class SubjectImpl extends Subject {
    List<Question> questionList = super.getQuestionList();

    @Override
    public void addQuestion(Question question) {
        questionList.add(question);
    }

    @Override
    public void dropQuestion(int index) {
        questionList.remove(index);
    }
}
