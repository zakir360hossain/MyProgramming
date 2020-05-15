package practical;

import java.util.*;

/**
 * @author Zakir Hossain
 * October 2, 2019
 * 			This is the testing of the object (practical.Book) I defined.
 *
 */
public class TestBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book book1 = new Book(200, "Kite Runner");
        book1.setBookMark(104);
        book1.setPageBack(30);
        System.out.println(book1);

        Book book2 = new Book(145, "The Fire");
        book2.setBookMark(146);
        System.out.println(book2 + "\n");

        Book book3 = new Book(100, "The Silence Behind the Curtain");
        book3.setBookMark(5);
        book3.setBookMark(7);
        System.out.println(book3 + "\n");

        Book book4 = new Book(100, "Das Kapital");
        book4.setBookMark(5);
        book4.setPageBack(7);
        System.out.println(book4 + "\n");


    }
}
