package vsu.course2.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alert {
    private Date issueDate;
    private String bookName;
    private Date returnDate;
    private Integer fine;
    private List<Librarian> librarian = new ArrayList<>();

    private List<Librarian> getLibrarian() {
        return librarian;
    }

    public Alert(Date issueDate, String bookName, Date returnDate, Integer fine) {
        this.issueDate = issueDate;
        this.bookName = bookName;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getBookName() {
        return bookName;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Integer getFine() {
        return fine;
    }
    public void viewAlert() {
        System.out.println("Дата выдачи: " + issueDate);
        System.out.println("Название книги: " + bookName);
        System.out.println("Дата возврата: " + returnDate);
        System.out.println("Штраф за просроченный возврат в день: " + fine + " руб.");
        System.out.println("Полученный штраф: " + fineCall());

    }

    public int fineCall() {
        Date currentDate = new Date();
        if (returnDate.before(currentDate)) {
            long overDays = (currentDate.getTime() - returnDate.getTime()) / (24*60*60*1000);
            int fineAmount = (int) (overDays * fine);
            return fineAmount;
        } else {
            return 0;
        }
    }
    public void sendToLibrarian(Librarian librarian) {
        librarian.getAlerts().add(this);
    }
    public void deleteAlertByNo(Librarian librarian, int alertNumber){
        if (alertNumber >= 1 && alertNumber <= librarian.getAlerts().size()) {
            librarian.getAlerts().remove(alertNumber-1);
        } else {
            System.out.println("Информация не найдена.");
        }


    }


}
