package com.ashish1312.javagraphqlstarter.resolver;

import com.ashish1312.javagraphqlstarter.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
//A resolver is responsible for resolving all the graphQl queries thrown.
public class BookResolver implements GraphQLQueryResolver {
    public Book getBook(String isbn) {
        return new Book("Learn GraphQL-Spring", "8234762323");
    }
}
