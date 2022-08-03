package com.chenqi.dp.dp_03_factorymethod;

public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
