package constructor;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int pageCount;
    private int chapters;
    private int year;

    public String toString(){
        return "" + this.name + "," + this.author + "," + this.publisher + "," + this.pageCount +
                "," + this.chapters + "," + this.year;
    }

    public Book(String name, String author, String publisher, int pageCount, int chapters, int year){
        this(name,author,publisher);
        this.pageCount = pageCount;
        this.chapters = chapters;
        this.year = year;
    }
    public Book(){

    }
    public Book(String name, String author, String publisher){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public void setPageCount(int count){
        this.pageCount = count;
    }
    public int getPageCount(){
        return pageCount;
    }
}
