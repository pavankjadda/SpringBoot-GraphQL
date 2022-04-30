package com.pj.springbootgraphql.web;

import com.pj.springbootgraphql.domain.Author;
import com.pj.springbootgraphql.dto.AuthorInput;
import com.pj.springbootgraphql.service.AuthorService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Spring Boot GraphQL Controller that handles all GraphQL requests for the Author entity.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    /**
     * Finds an Author by ID
     *
     * @param id the ID of the employee to find
     *
     * @return the found Author
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    @QueryMapping
    public Author findAuthorById(@Argument Long id) {
        return authorService.findById(id);
    }

    /**
     * Finds all Authors
     *
     * @return the list of all Authors
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    @QueryMapping
    public List<Author> findAllAuthors() {
        return authorService.findAllAuthors();
    }

    /**
     * Creates a new Author a new Author
     *
     * @param input the input to create the Author
     *
     * @return the created Author
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    @MutationMapping
    public Author createAuthor(@Argument AuthorInput input) {
        return authorService.createAuthor(input);
    }
}
