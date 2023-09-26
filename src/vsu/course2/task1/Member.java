package vsu.course2.task1;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String mName;
    private String mAddress;
    private Integer mNo;
    private List<Book> books;
    private Librarian librarian;
    public Member(String mName, String mAddress, Integer mNo, Librarian librarian) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNo = mNo;
        this.books = new ArrayList<>();
        this.librarian = librarian;
    }

    public String getmName() {
        return mName;
    }


    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public Integer getmNo() {
        return mNo;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void mRequestForBk(Book book) {
        if (books.size() < 3 && book.getNoOfBooks() != 0) {
            books.add(book);
            book.setMember(this);
            book.setNoOfBooks(book.getNoOfBooks()-1);
            librarian.getIssueBooks().add(book);
            System.out.println(this.getmName() + " успешно получил(а) книгу " + book.getAuthorName() + " " + book.getNameOfBook());

        } else if (book.getNoOfBooks() == 0) {
            System.out.println("Книга закончилась.");
        }
        else  {
            System.out.println("Читатель может иметь от 1 до 3 книг.");
        }
    }
    public void mReturnBk(Book book) {
      //  librarian.returnBook(book, this);
        books.remove(book);
        librarian.getIssueBooks().remove(book);
        book.setMember(null);
        book.setNoOfBooks(book.getNoOfBooks()+1);
        System.out.println(this.getmName() + " успешно вернул(а) книгу " + book.getAuthorName() + " " + book.getNameOfBook());
    }

}
