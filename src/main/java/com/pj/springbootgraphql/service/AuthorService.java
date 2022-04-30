package com.pj.springbootgraphql.service;

import com.pj.springbootgraphql.domain.Author;
import com.pj.springbootgraphql.dto.AuthorInput;

import java.util.List;

public interface AuthorService {
    /**
     * Finds an Author by ID
     *
     * @param id the ID of the employee to find
     *
     * @return the employee
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    Author findById(Long id);

    /**
     * Creates a new Author a new Author
     *
     * @param authorInput the input to create the Author
     *
     * @return the created Author
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    Author createAuthor(AuthorInput authorInput);

    /**
     * Finds all Authors
     *
     * @return the list of all Authors
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    List<Author> findAllAuthors();
}
