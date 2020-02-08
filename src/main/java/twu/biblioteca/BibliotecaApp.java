package twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(displayWelcomeMessage());
        List<Book> bookList = getListOfBooks();
        displayListOfBooks(bookList);
    }

    public static void displayListOfBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.getBookName());
        }
    }

    public static String displayWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }


    public static List<Book> getListOfBooks() {
        return new ArrayList<>();
    }


}
