package org.november.myfirstcassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
        students.add(new Student(UUID.randomUUID().toString(), "november","december","november@school.edu"));
        studentService.initializeStudent(students);
    }

    @GetMapping("/list")
    public Flux<Student> getAllStudent(){
        Flux<Student> students = studentService.getAllStudents();
        return students;
    }

    @GetMapping("/{firstname}/{id}")
    public Mono<Student> getStudentById(@PathVariable String firstname, @PathVariable  String id) {
        return studentService.getStudentById(firstname, id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Mono<Student> addStudent(@RequestBody Student student) {
        Mono<Student> savedStudent =  studentService.addStudent(student);
        return savedStudent;
    }
}
