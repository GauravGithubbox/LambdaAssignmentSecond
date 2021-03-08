package com.knoldus;

import java.util.function.IntUnaryOperator;

public class FindNextEvenNumber {
    public long lambdaexpressionApply(long Number){

        IntUnaryOperator operator = x -> x + 2 - (x % 2);
        long res = operator.applyAsInt(Math.toIntExact(Number));
        return res;
    }
}