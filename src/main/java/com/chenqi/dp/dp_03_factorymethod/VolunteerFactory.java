package com.chenqi.dp.dp_03_factorymethod;

public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
