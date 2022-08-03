package com.chenqi.dp.dp_04_abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}
