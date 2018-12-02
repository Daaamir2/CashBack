package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {


    @Test
    @DisplayName("should calculate....")
    void cashback() {
        CashBackService cashBackService = new CashBackService();
        cashBackService.cashback(1_000);
    }
}