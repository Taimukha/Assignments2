package repository;

import model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();


    public StudentRepository() {
        students.add(new Student(1, "Aiau"));
        students.add(new Student(2, "Ayazhan"));
    }

    public List<Student> getAllStudents() {
        return students;

    }
}