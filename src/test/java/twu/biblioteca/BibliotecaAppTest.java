package twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BibliotecaAppTest {

    @Test
    void shouldCheckIfDisplayWelcomeMessageFunctionReturnsCorrectString() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertEquals(expected, BibliotecaApp.displayWelcomeMessage());
    }

    @Test
    void shouldCheckAllBooksInListGetsPrinted() {
        List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("book1"), new Book("book2")));
        PrintStream mockedPrintStream = mock(PrintStream.class);
        System.setOut(mockedPrintStream);

        BibliotecaApp.displayListOfBooks(bookList);

        verify(mockedPrintStream,times(2)).println(anyString());
    }
}