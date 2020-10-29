package com.designpatterns.creationalpatterns.factorymethod.factories;

import com.designpatterns.creationalpatterns.factorymethod.books.Book;
import com.designpatterns.creationalpatterns.factorymethod.books.FantasyBook;

public class FantasyBookFactory extends BookFactory {
    @Override
    public Book create() {
        return new FantasyBook();
    }
}
