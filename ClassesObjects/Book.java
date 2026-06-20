package ClassesObjects;

public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;
    
    static{
        totalNoOfBooks = 0;
    }
    
    {
        totalNoOfBooks++;
    }
    
    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    
    Book(String isbn){
        this(isbn, "Unknown","Unknown");
    }
    
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is alrready borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }
    
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book, please leave the review");
        } else {
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {
        Book myBook = new Book("1", "Can't Hurt Me", "David Goggins");
        Book MyBook = new Book("2");

        System.out.println(Book.getTotalNoOfBooks());
        myBook.borrowBook();
        MyBook.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
    }
}
