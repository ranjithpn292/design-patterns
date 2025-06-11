package com.example.design_patterns.BehavioralDesignPatterns.IteratorPattern.BadCode;

public class ClientV1 {


    public static void main(String[] args){
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new Book("Cpp"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));
        bookCollection.addBook(new Book("React"));

//        for(Book book: bookCollection.getBooks()){
//            System.out.println(book.toString());
//        }
        Iterator<Book> bookIterator = bookCollection.createIterator();
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println("==>  " + book);
        }
    }
}
