package org.november.myfirstcassandra;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Mono;

public interface StudentRepository extends ReactiveCassandraRepository<Student, String> {

    Mono<Student> findByfirstNameAndStudentId(String firstname, String id);
}
