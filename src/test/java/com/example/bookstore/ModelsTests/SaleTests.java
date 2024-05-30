package com.example.bookstore.ModelsTests;

import com.example.bookstore.Data.Sale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SaleTests {
    @InjectMocks
    private Sale sale;

    @BeforeEach
    void setSale() {
        sale = Sale.builder()
                .id(1L)
                .first_name("Владимир")
                .last_name("Козлов")
                .position("Кассир")
                .employment_date("10.02.2024")
                .date_birth("17.08.2000")
                .email("kozlov@mail.ru")
                .build();
    }

    @Test
    void saleId() {
        assertEquals(1L, sale.getId());
    }

    @Test
    void saleFirstName() {
        assertEquals("Владимир", sale.getFirst_name());
    }

    @Test
    void saleLastName() {
        assertEquals("Козлов", sale.getLast_name());
    }

    @Test
    void saleEmploymentDate() {
        assertEquals("10.02.2024", sale.getEmployment_date());
    }

    @Test
    void saleDateBirth() {
        assertEquals("17.08.2000", sale.getDate_birth());
    }

    @Test
    void saleEmail() {
        assertEquals("kozlov@mail.ru", sale.getEmail());
    }

    @Test
    void saleInitial() {
        assertEquals("Владимир Козлов", sale.getInitial());
    }
}
