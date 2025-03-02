package service;

import model.Student;
import org.springframework.context.annotation.Primary;
import repository.StudentRepository;

import java.util.List;

@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.getAllStudents();
    }
}
