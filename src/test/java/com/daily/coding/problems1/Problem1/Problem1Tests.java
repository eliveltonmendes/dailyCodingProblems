package com.daily.coding.problems1.Problem1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.daily.coding.problems1.problem1.Problem1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Problem1Tests {

    Problem1 problem1;

    @Before
    public void setUp(){
        problem1 = new Problem1();
    }

    @Test
    public void validateTrue17() {
        List<Integer> listNumber = Arrays.asList(10, 15, 3, 7);
        assertTrue(problem1.resolveProblema(listNumber, 17));
    }

    @Test
    public void validateTrue25(){
        List<Integer> listNumber = Arrays.asList(10, 15, 3, 7);
        assertTrue(problem1.resolveProblema(listNumber, 25));
    }

    @Test
    public void validateTrue10(){
        List<Integer> listNumber = Arrays.asList(10, 15, 3, 7);
        assertTrue(problem1.resolveProblema(listNumber, 10));
    }

    @Test
    public void validateFalse3(){
        List<Integer> listNumber = Arrays.asList(10, 15, 3, 7);
        assertFalse(problem1.resolveProblema(listNumber, 3));
    }
}
