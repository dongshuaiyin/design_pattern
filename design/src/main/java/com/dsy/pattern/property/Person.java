package com.dsy.pattern.property;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 *  测试类
 *
 *  原型模式克隆方法
 *
 */
@Data
public class Person implements Cloneable, Serializable {
    private String name;
    private String age;
    private String sex;

    private List<String> hobbies;

    /**
     *  浅克隆对象
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深克隆对象
     * @return
     */
    public Person deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (Person)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
