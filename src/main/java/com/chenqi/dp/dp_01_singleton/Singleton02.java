package com.chenqi.dp.dp_01_singleton;

/**
 * 跟01是一个意思
 */
public class Singleton02 {
    private static final Singleton02 INSTANCE;
    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02() {};

    public static Singleton02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton02 m1 = Singleton02.getInstance();
        Singleton02 m2 = Singleton02.getInstance();
        System.out.println(m1 == m2);
    }
}
