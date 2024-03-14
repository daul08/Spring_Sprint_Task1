package bitlab.Spring_Sprint_Task1.db;

import bitlab.Spring_Sprint_Task1.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter
    private static List<Student> students = new ArrayList<>();
    private static Long id = 8L;
    static {
        students.add(new Student(1L, "Ivan", "Ivanov", 90 ));
        students.add(new Student(2L, "Petr", "Ivanov", 80 ));
        students.add(new Student(3L, "Fedya", "Ivanov", 70 ));
        students.add(new Student(4L, "Jenya", "Ivanov", 55 ));
        students.add(new Student(5L, "Sveta", "Ivanov", 30 ));
        students.add(new Student(6L, "Kolya", "Ivanov", 40 ));
        students.add(new Student(7L, "Nadya", "Ivanov", 80 ));
    }

    public static void addStudent(Student student) {
        student.setId(id);
        student.setMark(student.getExam());
        id++;
        students.add(student);
    }
}
