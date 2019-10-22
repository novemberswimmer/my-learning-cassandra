package org.november.myfirstcassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;


    public void initializeStudent(List<Student> students) {
        Flux<Student> savedStudents = studentRepo.saveAll(students);
        savedStudents.subscribe();
    }

    public Flux<Student> getAllStudents() {
        Flux<Student> students = studentRepo.findAll();
        return students;
    }

    public Mono<Student> getStudentById(String firstname, String id) {
        return studentRepo.findByfirstNameAndStudentId(firstname, id);
    }

    public Mono<Student> addStudent(Student student) {
        student.setStudentId(UUID.randomUUID().toString());
        Mono<Student> savedStudent =  studentRepo.save(student);
        return savedStudent;
    }
}
