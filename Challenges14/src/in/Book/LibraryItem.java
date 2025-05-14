package in.Book;

import java.util.Objects;

public class LibraryItem {
    // itemID, title, and author
    protected String itemID;
    protected String title;
    protected String author;
    protected boolean isCheckOut;

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        LibraryItem that = (LibraryItem) o;
//        return isCheckOut == that.isCheckOut && Objects.equals(itemID, that.itemID) && Objects.equals(title, that.title) && Objects.equals(author, that.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(itemID, title, author, isCheckOut);
//    }

//    public LibraryItem(String itemID, String title, String author) {
//        this.itemID = itemID;
//        this.title = title;
//        this.author = author;
//    }


    //checkout() and returnItem()
    public void checkout(){
        if(!isCheckOut){
            isCheckOut = true;
            System.out.printf("title : %S has been check out.",title);
        }
        else{
            System.out.printf("title : %S is already check out.",title);
        }
    }

    public void returnItem(){
        if (isCheckOut) {
            isCheckOut = false;
            System.out.printf("title : %S has been returned..",title);
        } else {
            System.out.printf("title : %S was not checked out.",title);
        }
    }
}