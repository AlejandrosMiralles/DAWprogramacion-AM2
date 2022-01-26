package Books;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Alejandro Miralles
 * @version 26/01/2022
 */
class Book{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private short borrowed;
    private boolean coursetext;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    Book(String bookAuthor, String bookTitle, int bookpages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        refNumber = "";
        borrowed = 0;
        coursetext = bookCourseText;
    }

    /**
     * Set the book's ID. It can only be changed with this method
     * @param bookRefNumber
     */
    void setRefNumber(String bookRefNumber){
        if (bookRefNumber.length()>2){ refNumber = bookRefNumber;}
        else{ System.out.println("ERROR: RefNumber has to have more than 2 characters.");}
    }

    //Getters
    String getAuthor() {
        return author;
    }
    String getTitle() {
        return title;
    }
    int getPages() {
        return pages;
    }
    String getRefNumber(){ return refNumber;}
    int getBorrowed(){ return borrowed;}
    boolean isCourseText(){ return coursetext;}

    //Prints
    void printAuthor(){ System.out.println("Author: "+author);}
    void printTitle(){ System.out.println("Title: "+title);}
    void printDetails() {
        System.out.println("Book [author=" + author + ", borrowed=" + borrowed + ", coursetext=" + coursetext + ", pages=" + pages
                + ", refNumber=" + refNumber + ", title=" + title + "]");
    }

    /**
     * Void method that is used when someone borrows this. book. It increases the "borrowed" variable by one
     */
    void borrow(){ ++borrowed;} 
}