package com.daily.coding.problems1.problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    /**
     * Given an array of integers, return a new array such that each element at index i of the 
     * new array is the product of all the numbers in the original array except the one at i.
     * 
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
     * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
     * 
     * Follow-up: what if you can't use division?
     */

    public List resolveProblema (List<Integer> arrayRecebido) {
        List<Integer> listRetorno = new ArrayList<>();

        for (Integer cursorExterno = 0; cursorExterno < arrayRecebido.size(); cursorExterno++) {
            List<Integer> arrayCalculo = preencheArrayCalculo(arrayRecebido, cursorExterno);

            Integer somaProduto = null;
            for (Integer valorMultiplicar : arrayCalculo) {
                if (somaProduto == null) {
                    somaProduto = valorMultiplicar;
                } else {
                    somaProduto = (somaProduto * valorMultiplicar);
                }
            }
            listRetorno.add(somaProduto);
        }

        return listRetorno;
    }

    public List preencheArrayCalculo(List<Integer> arrayRecebido, Integer posicaoIgnorada) {
        List<Integer> arrayRetorno = new ArrayList<>();

        for (Integer cursor = 0; cursor < arrayRecebido.size(); cursor++) {
            if (cursor != posicaoIgnorada) {
                arrayRetorno.add(arrayRecebido.get(cursor));
            }
        }

        return arrayRetorno;
    }
}