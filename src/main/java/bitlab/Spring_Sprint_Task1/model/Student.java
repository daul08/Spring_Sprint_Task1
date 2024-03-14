package bitlab.Spring_Sprint_Task1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Long id;

    private String name;
    private String surname;
    private int exam;
    private String mark;

    public Student(Long id, String name, String surname, int exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        setMark(exam);
    }
    public Student() {}

    public void setMark(int exam) {
        if (exam >= 90) mark = "A";
        else if (exam >= 75) mark = "B";
        else if (exam >= 60) mark = "C";
        else if (exam >= 50) mark = "D";
        else mark = "F";
    }
}
