package practical;

/**
 * @author Zakir Hossain
 * October 2, 2019
 * 			This is a user-defined object to maintain and update some informations about books
 *
 */

public class Book {
    private int numPage;
    private int bookMark;
    private String title;

    // Constructors

    public Book(){
        // Default constructors

        numPage = 0;
        bookMark = 0;
        title = "None";
    }
    // Parameterized constructors
    public Book(int np, String t){
        numPage = np;
        title = t;
        bookMark = 0;
    }

    //Accesor methods
    public int getNumPage(){
        return numPage;
    }

    public int getBookMark (){
        return bookMark;
    }

    public String getTitle(){
        return title;
    }

    // Mutator methods
    public int setBookMark(int pageRead) {

        this.bookMark = bookMark+pageRead;

        if( pageRead>=numPage){
            bookMark = numPage;

        }
        return  bookMark;
    }

    public  int setPageBack(int pageBack) {
        this.bookMark = bookMark-pageBack;
        if(bookMark<0){
           bookMark=0;

        }
        return bookMark;
    }

    public String toString(){
        String data = "";
        String progress = "";

        data = "\nTitle: " + title +"\nNumber of pages: "+
                numPage + "\nCurrent page: " + bookMark;

        return data;

    }
}
