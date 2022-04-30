package com.pj.springbootgraphql.repository;

import com.pj.springbootgraphql.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
