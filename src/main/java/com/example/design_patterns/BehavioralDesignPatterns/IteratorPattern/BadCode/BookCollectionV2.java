package com.example.design_patterns.BehavioralDesignPatterns.IteratorPattern.BadCode;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionV2 {
    private List<Book> books= new ArrayList<>();

    public Iterator<Book> createIterator(){
        return new BookIterator(this.books);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    private class BookIterator implements Iterator{

        private List<Book> books;
        private int position = 0;


        private BookIterator(List<Book> books){
            this.books = books;
        }
        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }

}
