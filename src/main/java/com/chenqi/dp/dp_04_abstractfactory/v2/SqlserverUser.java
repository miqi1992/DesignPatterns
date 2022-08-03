package com.chenqi.dp.dp_04_abstractfactory.v2;

public class SqlserverUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到User表一条记录");
        return null;
    }
}
