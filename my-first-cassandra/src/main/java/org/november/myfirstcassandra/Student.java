package org.november.myfirstcassandra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@AllArgsConstructor
@Getter
@Setter
@Table
public class Student {
    @PrimaryKey
    private @NonNull String StudentId;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String email;
}
