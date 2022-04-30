package com.pj.springbootgraphql.dto;

import lombok.Data;

@Data
public class AuthorInput {
    private String name;
    private String email;
    private String phoneNumber;
}
