package com.pj.springbootgraphql.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookInput {
    private String title;
    private String isbn;
    private Integer pages;
    private List<String> authors;

}
