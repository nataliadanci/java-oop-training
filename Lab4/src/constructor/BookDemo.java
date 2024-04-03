package constructor;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);
        Book book2 = new Book("Orice", "Roman Flaviu","Gazeta");
        book2.setPageCount(100);
        System.out.println(book2.getPageCount());
        System.out.println(book2);
        Book book3 = new Book("titlu","autor","editura",132,7,2010);
        System.out.println(book3);
    }
}