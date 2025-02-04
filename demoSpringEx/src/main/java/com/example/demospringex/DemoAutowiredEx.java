package com.example.demospringex;

import com.example.demospringex.entity.Student;
import com.example.demospringex.service.MessagePrinter;
import com.example.demospringex.service.NotificationManager;
import com.example.demospringex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication
public class DemoAutowiredEx {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAutowiredEx.class, args);

        MessagePrinter bean = context.getBean(MessagePrinter.class);
        bean.printMessage();

        NotificationManager sendMessage = context.getBean(NotificationManager.class);
        sendMessage.sendEmail();
        sendMessage.sendSms();
        sendMessage.getNotifications();

        Student student = context.getBean(Student.class);
        student.setAge(20);
        student.setId(1);
        student.setName("John");

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(student);

        List<Student> students = studentService.getStudents();

    }
}
