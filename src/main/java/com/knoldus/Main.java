package com.knoldus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  long value =");
        long number = sc.nextLong();

        FindNextEvenNumber object = new FindNextEvenNumber();
        long result= object.lambdaexpressionApply(number);

        System.out.println(result);

    }
}