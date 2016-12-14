package com.example;

/**
 * Created by zhaojipu on 2016/12/3.
 */

public enum EnumTest {
    XiaoMing1("小明",1),
    XiaoMing2("小明",2),
    XiaoMing3("小明",3),
    XiaoMing4("小明",4),
    XiaoMing5("小明",5),
    XiaoMing6("小明",6);

    private String name;
    private int age;

    EnumTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EnumTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
