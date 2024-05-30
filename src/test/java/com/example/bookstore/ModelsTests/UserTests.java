package com.example.bookstore.ModelsTests;

import com.example.bookstore.Data.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserTests {
    @InjectMocks
    private Users users;

    @BeforeEach
    void setUsers(){
        users = Users.builder()
                .id(1L)
                .username("sveto4ka")
                .nickname("Светлана")
                .password("123456")
                .email("svetlana123@mail.ru")
                .build();
    }

    @Test
    void usersId() {
        assertEquals(1L, users.getId());
    }

    @Test
    void usersUsername() {
        assertEquals("sveto4ka", users.getUsername());
    }

    @Test
    void usersNickname() {
        assertEquals("Светлана", users.getNickname());
    }

    @Test
    void usersPassword() {
        assertEquals("123456", users.getPassword());
    }

    @Test
    void usersEmail() {
        assertEquals("svetlana123@mail.ru", users.getEmail());
    }
}
