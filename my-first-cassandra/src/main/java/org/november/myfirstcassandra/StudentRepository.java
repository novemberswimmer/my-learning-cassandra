package org.november.myfirstcassandra;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface StudentRepository extends ReactiveCassandraRepository<Student, String> {


}
