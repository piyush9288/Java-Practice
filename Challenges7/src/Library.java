public class Library {
    public static void main(String[] args) {
        Book theLife = new Book(123L,"The Life ","Ram ");
        Book myFriend = new Book(15666L);
        System.out.println(Book.getTotalBooks());//static method calling
        theLife.borrowBook();
        myFriend.borrowBook();
        theLife.borrowBook();
        myFriend.returnBook();
        myFriend.borrowBook();
    }
}
