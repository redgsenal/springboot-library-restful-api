package com.tutorial.springboot.library.repository;

import com.tutorial.springboot.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
