package array;

/**
 * @author Zakir Hossain
 * December 13, 2019
 * This is the test program for the Book class. It instantiates the Book object as an array with
 * ten books. for each book, it calls certain methods from the Book class to manipulate and modify
 * the attributes for each book.
 */
public class BookTest {
    public static void main(String[] args) {

        // Instantiations of ten books
        Book[] books = new Book[10];
        books[0] = new Book(120, 23);
        books[1] = new Book(200, 20.69);
        books[2] = new Book(890, 250.99);
        books[3] = new Book(700, 30);
        books[4] = new Book(100, 15);
        books[5] = new Book(150, 19);
        books[6] = new Book(189, 28.79);
        books[7] = new Book(56, 8.99);
        books[8] = new Book(89, 10.99);
        books[9] = new Book(304, 60.90);

        // Calling the nextPage method
        books[0].nextPage();


        // Accumulating the total pages of all ten books
        int totalPage = 0;
        for (Book each : books) {
            totalPage += each.getNumPages();
        }

        // Accumulating the total cost of all ten books
        double totalCost = 0;
        for (Book each : books) {
            totalCost += each.getBookCost();
        }

        // Updating the cost of all the books based on the principle price
        // true => reduce the cost
        // false => increases the cost
        for (Book each : books) {
            if (each.getBookCost() < 25) {
                each.updateCost(false, 0.08);
            } else if (each.getBookCost() > 50) {
                each.updateCost(true, 0.11);
            }
        }
        System.out.println("Total number of pages of all 10 books: " + totalPage);
        System.out.println("Total cost of all 10 books: " + totalCost);

        System.out.println("Number of pages:\t\t\tCost:\t\t\tCurrent Page:");
        for (Book each : books) {
            System.out.println(each.toString());

        }


    }
}
