package com.chenqi.dp.dp_02_simplefactory;

public class OperationFactory {

    public static Operation getOperation(String ope) {
        Operation operation = null;
        switch (ope) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
        }
        return operation;
    }
}
