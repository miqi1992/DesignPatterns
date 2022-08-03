package com.chenqi.dp.dp_02_simplefactory;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
