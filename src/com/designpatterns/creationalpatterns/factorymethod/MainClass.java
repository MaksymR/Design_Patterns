package com.designpatterns.creationalpatterns.factorymethod;

import com.designpatterns.creationalpatterns.factorymethod.books.Book;
import com.designpatterns.creationalpatterns.factorymethod.factories.BookFactory;
import com.designpatterns.creationalpatterns.factorymethod.factories.FantasyBookFactory;
import com.designpatterns.creationalpatterns.factorymethod.factories.ScienceFictionBookFactory;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<BookFactory> creators = new ArrayList<>();
        creators.add(new FantasyBookFactory());
        creators.add(new ScienceFictionBookFactory());

        for (BookFactory bookFactory : creators) {
            Book book = bookFactory.create();
        }

    }

}
