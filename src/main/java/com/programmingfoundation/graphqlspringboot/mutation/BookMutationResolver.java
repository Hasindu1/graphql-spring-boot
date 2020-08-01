package com.programmingfoundation.graphqlspringboot.mutation;

import com.programmingfoundation.graphqlspringboot.model.Book;
import com.programmingfoundation.graphqlspringboot.model.BookWrapper;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {
    public Book createBook(BookWrapper bookWrapper){
         return new Book(bookWrapper.getTitle(),bookWrapper.getIsbn());
    }

}
