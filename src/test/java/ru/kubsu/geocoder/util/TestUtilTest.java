package ru.kubsu.geocoder.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestUtilTest {

    @Test
    void unitTest() {
        assertEquals(3, TestUtil.sum(1, 2));
        assertEquals(300, TestUtil.sum(100, 200));
        assertEquals(-3, TestUtil.sum(-1, -2));
        assertEquals(0, TestUtil.sum(0, 0));
    }
}