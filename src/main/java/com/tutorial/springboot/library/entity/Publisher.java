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
@Table(name = "publisher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long publisherId;

    @NotNull
    @NotEmpty
    @Column(name = "publisher_name", length = 100)
    private String publisherName;

    @NotNull
    @CreationTimestamp
    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;
}
