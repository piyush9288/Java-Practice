public class Book{
    // Create a Book class for a library system.
    // • Instance variables: title, author, isbn.
    // • Static variable: totalBooks, a counter for the total number of book instances.
    // • Instance methods: borrowBook(), returnBook().
    // • Static method: getTotalBooks(), to get the total number of books in the library

    String title;
    String author;
    long ISBN ;
    boolean isBorrowed = false;

    static int totalBooks; //a counter for the total number of book instances.

    static{
        totalBooks = 0;
    }
    {
        totalBooks++;
    }
    //instance variables
    Book(long ISBN,String title,String author){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }


    Book(long ISBN){
        this(ISBN,"unknown","unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy a book");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope! You Enjoy a Book,please give me review");
        }
        else{
            System.out.println("This book is already present in library");
        }
    }
}