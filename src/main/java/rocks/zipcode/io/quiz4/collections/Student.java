package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable<Student>{


    Integer id;
    Double totalStudyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {

        this.id = id != null ? id : 0;
        this.totalStudyTime = 0.0;

    }

    public void learn(Double amountOfHours) {
        totalStudyTime+=amountOfHours;

    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
