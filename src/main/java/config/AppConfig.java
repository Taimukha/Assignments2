package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import repository.StudentRepository;
import service.AdvancedStudentServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages = {"repository", "service"})
public class AppConfig {
    @Bean
    @Primary
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean(name = "advancedService")
    public StudentService advancedStudentService(StudentRepository studentRepository) {
        return new AdvancedStudentServiceImpl(studentRepository);
    }
}

