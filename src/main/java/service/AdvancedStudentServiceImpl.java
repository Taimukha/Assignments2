package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.List;

@Service
@Qualifier("advancedStudentService")
public class AdvancedStudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public AdvancedStudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        List<Student> students = studentRepository.getAllStudents();
        students.add(new Student(3, "New Student"));
        return students;
    }
}