package com.example.bookstore;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllersTests {

    @Autowired private WebApplicationContext context;
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }

    @Test
    @WithMockUser
    @DisplayName(value = "Тест контроллера главной страницы")
    public void testMainController() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("Main"))
                .andExpect(content().string(containsString("Главная страница")));
    }

    @Test
    @WithMockUser
    @DisplayName(value = "Тест контроллера страницы книг")
    public void testBookController() throws Exception {

        mockMvc.perform(get("/Book"))
                .andExpect(status().isOk())
                .andExpect(view().name("Book/Book"))
                .andExpect(content().string(containsString("Книги")));
    }

    @Test
    @WithMockUser
    @DisplayName(value = "Тест контроллера страницы покупателей")
    public void testCustomerController() throws Exception {

        mockMvc.perform(get("/Customer"))
                .andExpect(status().isOk())
                .andExpect(view().name("Customer/Customer"))
                .andExpect(content().string(containsString("Покупатели")));
    }


    @Test
    @WithMockUser
    @DisplayName(value = "Тест контроллера страницы заказов")
    public void testDeliveryController() throws Exception {

        mockMvc.perform(get("/Delivery"))
                .andExpect(status().isOk())
                .andExpect(view().name("Delivery/Delivery"))
                .andExpect(content().string(containsString("Заказы")));
    }


    @Test
    @WithMockUser
    @DisplayName(value = "Тест контроллера страницы продавцов")
    public void testSaleController() throws Exception {

        mockMvc.perform(get("/Sale"))
                .andExpect(status().isOk())
                .andExpect(view().name("Sale/Sale"))
                .andExpect(content().string(containsString("Продавцы")));
    }

    @Test
    @WithAnonymousUser
    @DisplayName(value = "Тест контроллера страницы регистрации")
    public void testRegistrationController() throws Exception {

        mockMvc.perform(get("/Registration"))
                .andExpect(status().isOk())
                .andExpect(view().name("Registration"))
                .andExpect(content().string(containsString("Регистрация")));
    }


    @Test
    @WithAnonymousUser
    @DisplayName(value = "Тест контроллера страницы авторизации")
    public void testLoginController() throws Exception {

        mockMvc.perform(get("/Login"))
                .andExpect(status().isOk())
                .andExpect(view().name("Login"))
                .andExpect(content().string(containsString("Вход")));
    }





}