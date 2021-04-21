package com.daily.coding.problems1.Problem1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.daily.coding.problems1.problem2.Problem2;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Problem2Tests {

    Problem2 problem2;

    @Before
    public void setUp() {
        problem2 = new Problem2();
    }

    @Test
    public void testSuccess1() {
        List<Integer> arrayEnviado = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arrayExperado = Arrays.asList(120, 60, 40, 30, 24);

        assertArrayEquals(arrayExperado.toArray(), problem2.resolveProblema(arrayEnviado).toArray());
    }

    @Test
    public void testSuccess2() {
        List<Integer> arrayEnviado = Arrays.asList(3, 2, 1);
        List<Integer> arrayExperado = Arrays.asList(2, 3, 6);

        assertArrayEquals(arrayExperado.toArray(), problem2.resolveProblema(arrayEnviado).toArray());
    }
}