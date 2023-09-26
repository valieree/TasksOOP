package vsu.course2.task1;

public class Book {
    private String authorName;
    private String nameOfBook;
    private Integer noOfBooks;

    private Member member; // +1
    //private vsu.course2.task1.Catalog catalog;

    public Book(String authorName, String nameOfBook, Integer noOfBooks) {
        this.authorName = authorName;
        this.nameOfBook = "„" + nameOfBook + "”";
        this.noOfBooks = noOfBooks;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public Integer getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(Integer noOfBooks) {
        if (noOfBooks >= 0) {
            this.noOfBooks = noOfBooks;
             //catalog.updateInfo(catalog.getNoOfCopies() + noOfBooks);
        }
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {

        this.member = member;
    }

    //    public void removeFromCatalogtest(vsu.course2.task1.Catalog catalog) {
//            catalog.removeBook(this);
//    }
//    public void addToCatalogtest(vsu.course2.task1.Catalog catalog) {
//        catalog.addBook(this);
//    }
    public void removeFromCatalog(Catalog catalog) {
        catalog.getBooks().remove(this);
        catalog.updateInfo(catalog.getNoOfCopies() - this.getNoOfBooks());
        System.out.println("Книга автора " + this.authorName+ " " + this.nameOfBook + " удалена из каталога");
    }

    public void addToCatalog(Catalog catalog) {

        catalog.getBooks().add(this);
        catalog.updateInfo(catalog.getNoOfCopies() + this.getNoOfBooks());
        System.out.println("Книга автора " + this.authorName + " " + this.nameOfBook + " добавлена в каталог");
    }

}
