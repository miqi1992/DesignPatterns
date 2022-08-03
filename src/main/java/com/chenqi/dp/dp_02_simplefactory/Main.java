package com.chenqi.dp.dp_02_simplefactory;

public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
