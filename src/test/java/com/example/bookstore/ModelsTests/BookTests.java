package com.example.bookstore.ModelsTests;

import com.example.bookstore.Data.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookTests {
    @InjectMocks
    private Book book;

    @BeforeEach
    void setBook() {
        book = Book.builder()
                .id(1L)
                .author("Л. Н. Толстой")
                .title("Война и мир")
                .publishing("АСТ")
                .seriya("Эксклюзив: Русская классика")
                .year(2022)
                .price(288)
                .build();
    }

    @Test
    void bookId() {
        assertEquals(1L, book.getId());
    }

    @Test
    void bookAuthor() {
        assertEquals("Л. Н. Толстой", book.getAuthor());
    }

    @Test
    void bookTitle() {
        assertEquals("Война и мир", book.getTitle());
    }

    @Test
    void bookPublishing() {
        assertEquals("АСТ", book.getPublishing());
    }

    @Test
    void bookSeriya() {
        assertEquals("Эксклюзив: Русская классика", book.getSeriya());
    }

    @Test
    void bookYear() {
        assertEquals(2022, book.getYear());
    }

    @Test
    void bookPrice() {
        assertEquals(288, book.getPrice());
    }
}
