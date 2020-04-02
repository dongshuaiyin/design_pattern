package com.dsy.pattern.property;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        //人员对象
        Person person = new Person();
        person.setName("John");
        person.setAge("18");
        person.setSex("男");

        List<String> list = new ArrayList<>();
        list.add("game");
        list.add("play");
        person.setHobbies(list);

        Person person1 = (Person) person.deepClone();
        person1.getHobbies().add("read");
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person == person1);
    }
}
