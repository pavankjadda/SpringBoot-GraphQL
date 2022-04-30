package com.pj.springbootgraphql.dto;

import lombok.Data;


/**
 * AuthorInput class that maps to input of the GraphQL Author
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Data
public class AuthorInput {
    private String name;
    private String email;
    private String phoneNumber;
}
