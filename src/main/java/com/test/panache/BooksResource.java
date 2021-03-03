package com.test.panache;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;

import java.util.List;

@ResourceProperties(hal = true)
public interface BooksResource extends PanacheRepositoryResource<BookRepository, Book, Long> {
    @MethodProperties(path = "all")
    List<Book> list(Page page, Sort sort);

    @MethodProperties(exposed = true)
    boolean delete(Long id);
}
