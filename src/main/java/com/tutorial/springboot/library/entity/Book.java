package com.tutorial.springboot.library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @NotNull
    @Column(name = "isbn", length = 17)
    private String isbn;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "published_date")
    private LocalDateTime publishedDate;

    @NotNull
    @CreationTimestamp
    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;


}
