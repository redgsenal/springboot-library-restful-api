package com.tutorial.springboot.library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;

    @NotNull
    @NotEmpty
    @Column(name = "first_name", length = 100)
    private String firstName;

    @NotNull
    @NotEmpty
    @Column(name = "last_name", length = 100)
    private String lastName;

    @NotNull
    @NotEmpty
    @Column(name = "gender", length = 30)
    private String gender;

    @NotNull
    @CreationTimestamp
    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;

}
