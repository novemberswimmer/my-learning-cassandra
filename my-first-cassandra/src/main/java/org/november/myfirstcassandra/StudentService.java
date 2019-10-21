package org.november.myfirstcassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;


    public void initializeStudent(List<Student> students) {
        Flux<Student> savedStudents = studentRepo.saveAll(students);
        savedStudents.subscribe();
    }
}
