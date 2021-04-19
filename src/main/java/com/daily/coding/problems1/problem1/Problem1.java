package com.daily.coding.problems1.problem1;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    /**
     * Problem
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    
    public boolean calculateValue(List<Integer> numberList, Integer expectedValue) {
        List<Integer> arraySoma = preencheArraySoma(numberList);
        return identificaSomaExperada(arraySoma, expectedValue);
    }

    private List preencheArraySoma(List<Integer> arrayValores) {
        List<Integer> arraySomas = new ArrayList<>();

        for (Integer cursorExterno = 0; cursorExterno < arrayValores.size(); cursorExterno++) {            
            for (Integer cursorInterno = (cursorExterno + 1); cursorInterno < arrayValores.size(); cursorInterno++) { 
                Integer valorExterno = arrayValores.get(cursorExterno);
                Integer valorInterno = arrayValores.get(cursorInterno);

                arraySomas.add(valorExterno + valorInterno);
            }
        }

        return arraySomas;
    } 

    private boolean identificaSomaExperada(List<Integer> arrayValores, Integer expectedValue){
        for (Integer valorSoma : arrayValores) {
            if (valorSoma == expectedValue) {
                return true;
            }
        }

        return false;
    }
}