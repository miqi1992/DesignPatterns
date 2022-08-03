package com.chenqi.dp.dp_03_factorymethod;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.BuyRice();
    }

}
