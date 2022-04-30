package com.pj.springbootgraphql.dto;

import lombok.Data;

import java.util.List;

/**
 * BookInput class that maps to input of the GraphQL Book
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Data
public class BookInput {
    private String title;
    private String isbn;
    private Integer pages;
    private List<String> authors;

}
