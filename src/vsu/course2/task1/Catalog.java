package vsu.course2.task1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
private String name;
private Integer noOfCopies;

//private List<vsu.course2.task1.Book> books = new ArrayList<>();
private List<Book> books;

    public Catalog(String name, Integer noOfCopies, List<Book> books) {
        this.name = name;
        this.noOfCopies = noOfCopies;
        this.books = new ArrayList<>();
        //this.books = books;

    }
    public Catalog(String name, Integer noOfCopies) {
        this.name = name;
        this.noOfCopies = noOfCopies;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public List<Book> getBooks() {
        return books;

    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }



    // **********************************
//
//    public void removeBook(vsu.course2.task1.Book book) {
//        books.remove(book);
//    }
//    public void addBook(vsu.course2.task1.Book book) {
//        books.add(book);
//    }
//    public void updateInfo (String authorName, String nameOfBook, Integer newNoOfBooks) {
//        for (vsu.course2.task1.Book book : books) {
//            if (book.getAuthorName().equals(authorName)) {
//                book.setNoOfBooks(newNoOfBooks);
//                System.out.println("Изменение количества книг " + book.getNameOfBook() + ". " + "Текущее количество: " + newNoOfBooks);
//            }
//        }
        public void updateInfo (Integer newNoOfBooks) {
            this.noOfCopies = newNoOfBooks;

        }
        public void print () {
            System.out.println("Каталог с количеством книг: " + noOfCopies);
           for (Book book: books) {
               System.out.println("Автор: "+ book.getAuthorName() + ". " +"Название книги: " + book.getNameOfBook() + ". " + "Количество: " + book.getNoOfBooks());
           }

        }




    public List<Book> searching(String authorName) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book: books) {
            if (book.getAuthorName().equals(authorName)) {
                searchResults.add(book);
                System.out.println("Название найденной книги: " + book.getNameOfBook() + ". " + "Количество: " + book.getNoOfBooks());
            }
        }
        return searchResults;

    }


}
