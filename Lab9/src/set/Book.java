package set;

public class Book {

    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public boolean equals(Object o){
        Book book = (Book) o;
        return this.title == book.title &&
                this.numberOfPages == book.numberOfPages;
    }

    //trebuie implementat de noi astfel incat pentru doua obiecte egale (equals() returneaza true) sa se
    //returneze aceeasi valoare
    @Override
    public int hashCode(){
        return title.hashCode() + numberOfPages;

    }
}
