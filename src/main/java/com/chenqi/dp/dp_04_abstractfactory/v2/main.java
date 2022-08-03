package com.chenqi.dp.dp_04_abstractfactory.v2;

public class main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1l);
        user.setName("测试");
        IFactory factory = new SqlserverFactory();
        IDepartment department = factory.createDepartment();
        IUser iUser = factory.createUser();
        iUser.insert(user);

    }
}
