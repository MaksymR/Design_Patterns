package com.designpatterns.creationalpatterns.factorymethod.factories;

import com.designpatterns.creationalpatterns.factorymethod.books.Book;
import com.designpatterns.creationalpatterns.factorymethod.books.ScienceFictionBook;

public class ScienceFictionBookFactory extends BookFactory {
    @Override
    public Book create() {
        return new ScienceFictionBook();
    }
}
