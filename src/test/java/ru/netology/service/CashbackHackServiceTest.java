package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemain900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);

        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);

        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1100);

        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);

        int expected = 1000;

        assertEquals(actual, expected);

    }
}