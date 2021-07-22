package pojo.impl;

import pojo.Grade;

import java.util.Map;
import java.util.Set;

public class GradeImpl extends Grade {
    Map<String, Integer> examsScore = super.getExamsScore();
     public double calculateAvg() {
         float total = 0;
         Set<String> keys = examsScore.keySet();
         for(String key : keys) {
             total += examsScore.get(key);
         }
         return total/keys.size();
     }

    public Integer addEntry(String name, Integer score){
        return examsScore.put(name, score);
    }

    public Integer deleteEntry(String examName) {
         return examsScore.remove(examName);
     }

    public void modifyEntry(String examName, Integer score) {
         examsScore.replace(examName, score);
     }

    public Integer getScore(String examName) {
         return examsScore.get(examName);
     }

    public void emptyAll() {
         examsScore = null;
     }
}
