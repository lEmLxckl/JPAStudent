package org.example.jpastudent1;

import org.example.jpastudent1.model.Student;
import org.example.jpastudent1.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class JpaStudent1ApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp(){
        Student std = new Student();
        std.setName("test");
        studentRepository.save(std);
    }
    @Test
    void testOneStudent() {
        List<Student> lst = studentRepository.findAll();
        assertEquals(1, lst.size());
    }

}
