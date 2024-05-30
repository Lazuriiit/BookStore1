package com.example.bookstore.ModelsTests;

import com.example.bookstore.Data.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerTests {
    @InjectMocks
    private Customer customer;

    @BeforeEach
    void setCustomer() {
        customer = Customer.builder()
                .id(1L)
                .first_name("Одинцова")
                .last_name("Мария")
                .phone("89381776544")
                .email("odyncova@gmail.com")
                .build();
    }

    @Test
    void customerId() {
        assertEquals(1L, customer.getId());
    }

    @Test
    void customerFirstName() {
        assertEquals("Одинцова", customer.getFirst_name());
    }

    @Test
    void customerLastName() {
        assertEquals("Мария", customer.getLast_name());
    }

    @Test
    void customerPhone() {
        assertEquals("89381776544", customer.getPhone());
    }

    @Test
    void customerEmail(){
        assertEquals("odyncova@gmail.com", customer.getEmail());
    }

    @Test
    void customerInitial() {
        assertEquals("Одинцова Мария", customer.getInitial());
    }

}
