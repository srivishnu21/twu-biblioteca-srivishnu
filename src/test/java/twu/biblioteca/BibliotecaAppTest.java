package twu.biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BibliotecaAppTest {

    @Test
    void shouldCheckIfDisplayWelcomeMessageFunctionIsCalled() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        Assertions.assertEquals(expected, BibliotecaApp.displayWelcomeMessage());
    }
}