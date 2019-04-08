package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> studentsList;

    public ZipCodeWilmington() {
        this.studentsList = new ArrayList<>();
    }


    public void enroll(Student student) {
        studentsList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return studentsList.contains(student);
    }

    public void lecture(double numberOfHours) {
        studentsList.stream().forEach(stud -> stud.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {

        Map<Student, Double> studyMap = new TreeMap<>();

        studentsList.stream().forEach(student -> studyMap.put(student, student.getTotalStudyTime()));
        return studyMap;
    }
}
