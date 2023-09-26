package vsu.course2.task1;

public class FacultyMember extends Member {
    private String fName;
    private String facultyColl;

    public FacultyMember(String mName, String mAddress, Integer mNo, String fName, String facultyColl, Librarian librarian) {
        super(mName, mAddress, mNo, librarian);
        this.fName = fName;
        this.facultyColl = facultyColl;
    }

    public String getfName() {
        return fName;
    }

    public String getFacultyColl() {
        return facultyColl;
    }


    public void checkoutBk() {
        System.out.println("Полученные книги: ");
        for (Book books: getBooks()) {
            System.out.println(books.getAuthorName() + " " + books.getNameOfBook());
        }


    }
}
