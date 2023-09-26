package vsu.course2.task1;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String address;
    private Integer mobileNo;
   // private List<vsu.course2.task1.Alert> alerts;
    private List<Alert> alerts = new ArrayList<>();
    private List<Book> books;
    private List<Member> members = new ArrayList<>();
    private List<Book> issueBooks;


    public Librarian(String name, String address, Integer mobileNo) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.issueBooks = new ArrayList<>();

    }

    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public List<Book> getIssueBooks() {
        return issueBooks;
    }

    public void updateInfo(Book book, Integer newNoOfBooks) {
        book.setNoOfBooks(newNoOfBooks);
    }

    public void issueBooks() {
        System.out.println("Книги, выданные библиотекарем " + this.getName());
        for (Book issuebook: issueBooks) {
            System.out.println("Автор: " + issuebook.getAuthorName() + ". " + "Название: " + issuebook.getNameOfBook() );
        }
    }
    public void memberInfo(Member member) {
        System.out.println("Имя читателя: " + member.getmName());
        System.out.println("Адрес читателя: " + member.getmAddress());
        System.out.println("Номер читателя: " + member.getmNo());
        System.out.println("Полученные книги читателя " + member.getmName() + ":");
        for (Book books: member.getBooks()) {
            System.out.println(books.getAuthorName() + " " + books.getNameOfBook());
        }
        for (Alert alerts: alerts) {
            alerts.viewAlert();
        }

    }
//    public List<vsu.course2.task1.Book> searchBook(String keyword) {
//        List<vsu.course2.task1.Book> results = new ArrayList<>();
//        for (vsu.course2.task1.Book book : books) {
//            if (book.getNameOfBook().contains(keyword) || book.getAuthorName().contains(keyword)) {
//                results.add(book);
//
//            }
//        }
//        for (vsu.course2.task1.Book book: results) {
//            System.out.println("Автор: " + book.getAuthorName() + ". " + "Название: " + book.getNameOfBook());
//        }
//        return results;
//    }
    public void searchBook(Book book) {

    }
    public void returnBook(Book book, Member member) {
        member.mReturnBk(book);
        book.setNoOfBooks(book.getNoOfBooks()+1);
    }

}
