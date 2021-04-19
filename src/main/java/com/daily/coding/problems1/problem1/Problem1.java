package com.daily.coding.problems1.problem1;

import java.util.List;

public class Problem1 {
    /**
     * Problem
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    
    public boolean calculateValue(List<Integer> numberList, Integer expectedValue) {
        boolean isCalculable = false;

        for (Integer cursorExterno = 0; cursorExterno < numberList.size(); cursorExterno++) {            
            for (Integer cursorInterno = (cursorExterno + 1); cursorInterno < numberList.size(); cursorInterno++) { 
                Integer valorExterno = numberList.get(cursorExterno);
                Integer valorInterno = numberList.get(cursorInterno);

                isCalculable = isCorrectSum(valorExterno, valorInterno, expectedValue);

                if (isCalculable) {
                    break;
                }
            }

            if (isCalculable) {
                break;
            }
        }

        return isCalculable;
    }

    public boolean isCorrectSum(Integer value1, Integer value2, Integer expectedValue) {
        return (value1 + value2) == expectedValue;
    }


}
