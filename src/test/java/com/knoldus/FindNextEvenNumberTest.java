package com.knoldus;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FindNextEvenNumberTest{
    @Test
    public void isMaxNumber() {
        FindNextEvenNumber obj = new FindNextEvenNumber();
        Long val = obj.lambdaexpressionApply(50000);
        Assertions.assertEquals(50002, val);
    }

    @Test
    public void TestForOddNUmber() {
        FindNextEvenNumber obj = new FindNextEvenNumber();
        Long val = obj.lambdaexpressionApply(50001);
        Assertions.assertEquals(50002, val);
    }
}