package Books;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BookTest {
    Book book = new Book("Julio Jesús", "Aprende a PROGRAMAR EN Java. Para comezar", 10, true);
    @Test
    public void testBorrow() {
        book.borrow();

        assertEquals(1, (long) book.getBorrowed());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Julio Jesús", book.getAuthor());
    }

    @Test
    public void testGetPages() {
        assertEquals(10, book.getPages());
    }

    @Test
    public void testGetRefNumber() {
        assertEquals("", book.getRefNumber());

        book.setRefNumber("Pepito Grillo");

        assertEquals("Pepito Grillo", book.getRefNumber());
    }

    @Test
    public void testFGetRefNumber(){book.setRefNumber("PP");}

    @Test
    public void testGetTitle() {
        assertEquals("Aprende a PROGRAMAR EN Java. Para comezar", book.getTitle());
    }

    @Test
    public void testIsCourseText() {
        assertEquals(true, book.isCourseText());
    }

    @Test
    public void testToString(){ book.printDetails();}

    public static void main(String[] args) {
        BookTest tester = new BookTest();

        tester.testToString();
        tester.testFGetRefNumber();
    }

}
