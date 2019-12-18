package com.companyname.automobile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AdderTest {
    private Adder adder;
    @BeforeEach
    public void setUp() {
        adder = new Adder();
    }
    @Test
    public void whenAddTwoZerosThenSumIsZero() {
        assertEquals(0, adder.add(0, 0));
    }
    @Test
    public void whenAddFirst_ZeroSecondNegativeThenSumIsEqualToSecond() {
        assertEquals(-1, adder.add(0, -1));
    }
    @Test
    public void whenAddFirstNegativeSecondZeroThenSumIsEqualToFirst() {
        assertEquals(-1, adder.add(-1, 0));
    }
    @Test
    public void whenTwoNegativesThenSumIsCorrect() {
        assertEquals(-3, adder.add(-1, -2));
    }
    @Test
    public void whenAddFirstZeroSecondPositiveThenSumIsEqualToSecond() {
        assertEquals(1, adder.add(0, 1));
    }
    @Test
    public void whenAddFirstPositiveSecondZeroThenSumIsEqualToFirst() {
        assertEquals(1, adder.add(1, 0));
    }
    @Test
    public void whenTwoPositivesThenSumIsCorrect() {
        assertEquals(3, adder.add(1, 2));
    }
    @Test
    public void whenAddFirstPositiveSecondNegativeThenSumIsCorrect() {
        assertEquals(0, adder.add(1, -1));
    }
    @Test
    public void whenAddFirstNegativeSecondPositiveThenSumIsCorrect() {
        assertEquals(0, adder.add(-1, 1));
    }
}
