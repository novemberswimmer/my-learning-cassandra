package org.november.myfirstcassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostConstruct
    public void saveStudents() {
        List<Student> students = new ArrayList();
        students.add(new Student(UUID.randomUUID().toString(), "november","decemner","november@school.edu"));
        studentService.initializeStudent(students);
    }
}
