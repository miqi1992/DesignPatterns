package com.chenqi.dp.dp_04_abstractfactory.v2;

public class SqlserverFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
