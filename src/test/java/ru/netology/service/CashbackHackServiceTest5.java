package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest5 {

    @Test
    public void testRemain900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);

        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1100);

        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);

        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);

        int expected = 1000;

        assertEquals(expected, actual);

    }
}