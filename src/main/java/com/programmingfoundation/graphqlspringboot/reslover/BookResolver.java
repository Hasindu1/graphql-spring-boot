package com.programmingfoundation.graphqlspringboot.reslover;

import com.programmingfoundation.graphqlspringboot.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {
    public Book getBook(String isbn){
        return new Book("Learn GraphQL","12345");

    }
}
