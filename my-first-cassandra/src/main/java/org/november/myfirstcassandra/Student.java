package org.november.myfirstcassandra;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@AllArgsConstructor
@Getter
@Setter
@Table
public class Student {
    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    private  String studentId;
    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String email;
}
