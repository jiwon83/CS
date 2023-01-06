package DesignPattern.iterator;
/*
- iterator 객체
- Book [] books;
- books 초기화, book을 추가하거나, index로 가져올 수 있음.
- BookSelfIterator를 반환
 */
public class BookShelf implements Aggregate {

    private Book [] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook( Book book){
        books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
