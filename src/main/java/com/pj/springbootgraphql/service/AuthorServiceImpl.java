package com.pj.springbootgraphql.service;

import com.pj.springbootgraphql.domain.Author;
import com.pj.springbootgraphql.dto.AuthorInput;
import com.pj.springbootgraphql.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

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
    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

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
    @Override
    public Author createAuthor(AuthorInput authorInput) {
        return authorRepository.saveAndFlush(new Author(authorInput.getName(), authorInput.getEmail(), authorInput.getPhoneNumber()));
    }

    /**
     * Finds all Authors
     *
     * @return the list of all Authors
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
