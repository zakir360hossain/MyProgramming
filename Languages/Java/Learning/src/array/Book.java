package array;

/**
 * @author Zakir Hossain
 * December 13, 2019
 * This program creates an object class for book with some private data.
 * The program initializes the private data with some constructors.
 * It contains setters to set private data and getters to fetch private.
 * It also contains some other methods to calculate and manipulate data.
 */
public class Book {
    // attributes
    private int numPages;
    private int currentPage;
    private double bookCost;

    // constructors
    public Book() {
        numPages = 0;
        currentPage = 1;
        bookCost = 0;
    }

    public Book(int numP, double cost) {
        numPages = numP;
        currentPage = 1;
        bookCost = cost;
    }

    // accessor methods
    public int getNumPages() {
        return numPages;
    }

    // mutator methods
    public void setNumPages(int numP) {
        numPages = numP;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentP) {
        currentPage = currentP;
    }

    public double getBookCost() {
        return bookCost;
    }

    public void setBookCost(double cost) {
        bookCost = cost;
    }

    // other methods
    public int nextPage() {
        currentPage += 1;
        return currentPage;
    }

    public int resetPage(int backPage) {
        return currentPage -= backPage;
    }

    // false: increases the price, true: reduces the price
    // I changed to void because I don't need to return anything, just updating the private data
    public void updateCost(boolean sale, double percent) {
        if (!sale) {
            bookCost = bookCost + (bookCost * percent);
        } else if (sale) {
            bookCost = bookCost - bookCost * percent;
        }
    }

    // utility method
    public String toString() {
        String output;
        output = numPages + "\t\t\t\t\t\t$" + Math.round(bookCost * 100.0) / 100.0 + "\t\t\t" + currentPage;
        return output;
    }
}
