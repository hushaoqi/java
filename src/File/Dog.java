package File;

import java.io.Serializable;

/**
 * @ClassName Dog
 * @Description 如果一个类创建的对象，需要被序列化，那么该类必须实现serializable接口
 * Serializable是一个标记接口，没有任何定义，为了告诉JVM该类对象可以被序列化。
 * 什时候对象需要被序列化呢？
 * 1、把对象保存在在文件中（存储到物理介质）
 * 2、对象需要在网络上传输
 *
 * @Author CheChinah
 * @Date 2018/9/25 18:04
 * @Version 1.0
 */
public class Dog implements Serializable {
    private String name;
    private int age;
    private String sex;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog(String wangwang, int i, String 母) {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

