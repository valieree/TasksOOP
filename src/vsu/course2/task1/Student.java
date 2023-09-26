package vsu.course2.task1;

public class Student extends Member {
    private String sName; // не нужно ?
    private String studentColl;

    public Student(String mName, String mAddress, Integer mNo, String sName, String studentColl, Librarian librarian) {
        super(mName, mAddress, mNo, librarian);
        this.sName = sName;
        this.studentColl = studentColl;
    }

    public String getsName() {
        return sName;
    }

    public String getStudentColl() {
        return studentColl;
    }
    public void checkoutBk() {
        System.out.println("Полученные книги студента " + this.getmName() + ":");
        for (Book books: getBooks()) {
            System.out.println(books.getAuthorName() + " " + books.getNameOfBook());
        }
    }
    //returnbk повторяет mreturnbk ??
}
