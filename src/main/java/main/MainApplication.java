package main;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import service.LazyBean;
import service.StudentService;
@Component
public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Spring Context initialized!");
        StudentService primaryService = context.getBean(StudentService.class);
        System.out.println("Primary Service Students:");

        primaryService.getStudents().forEach(s -> System.out.println(s.getName()));

        StudentService advancedService = context.getBean("advancedService", StudentService.class);
        System.out.println("Advanced Service Students:");
        advancedService.getStudents().forEach(s -> System.out.println(s.getName()));

        LazyBean lazyBean = context.getBean(LazyBean.class);

        context.close();
    }
}