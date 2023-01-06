package DesignPattern.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("DB"));
        bookShelf.appendBook(new Book("Around the World in 80"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));

        Iterator iter = bookShelf.iterator();
        while (iter.hasNext()){
            Book book = (Book) iter.next();
            System.out.println(book.getName());
        }
    }
}
