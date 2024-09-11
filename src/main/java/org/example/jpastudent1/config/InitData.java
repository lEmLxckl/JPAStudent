package org.example.jpastudent1.config;

import org.example.jpastudent1.model.Student;
import org.example.jpastudent1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Emre");
        s1.setBornDate(LocalDate.of(2001, 11, 12 ));
        s1.setBorntime(LocalTime.of(10,11,12));


        studentRepository.save(s1);
        s1.setName("Bruce");
        studentRepository.save(s1);
        s1.setName("Finish");
        studentRepository.save(s1);
    }
}
