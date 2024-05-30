package com.example.bookstore.ModelsTests;

import com.example.bookstore.Data.Book;
import com.example.bookstore.Data.Customer;
import com.example.bookstore.Data.Delivery;
import com.example.bookstore.Data.Sale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DeliveryTests {
    @InjectMocks
    private Delivery delivery;

    private Book book;

    private Sale sale;

    private Customer customer;

    @BeforeEach
    void setDelivery() {
        delivery = Delivery.builder()
                .id(1L)
                .book(book)
                .customer(customer)
                .sale(sale)
                .quantity(10)
                .total_sum(5400)
                .date_input("13.05.2024")
                .date_output("15.05.2024")
                .build();
    }

    @Test
    void deliveryId() {
        assertEquals(1L, delivery.getId());
    }

    @Test
    void deliveryBook() {
        assertEquals(book, delivery.getBook());
    }

    @Test
    void deliveryCustomer() {
        assertEquals(customer, delivery.getCustomer());
    }

    @Test
    void deliverySale() {
        assertEquals(sale, delivery.getSale());
    }

    @Test
    void deliveryQuantity() {
        assertEquals(10, delivery.getQuantity());
    }

    @Test
    void deliveryTotalSum() {
        assertEquals(5400, delivery.getTotal_sum());
    }

    @Test
    void deliveryDateInput() {
        assertEquals("13.05.2024", delivery.getDate_input());
    }

    @Test
    void deliveryDateOutput() {
        assertEquals("15.05.2024", delivery.getDate_output());
    }

}
