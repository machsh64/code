package day16;

/**
*@author : Ren
*@Date : 2022-06-09  23:00
*@Param : [Person]

*/
public class Person {

    private int age;
    private String name;
    private String sex;
    private int height;
    private int weight;


    public Person() {
        age = 18;
    }

    public Person(int age, String name,String sex) {
        setAge(age);
        setName(name);
        setSex(sex);
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            throw new RuntimeException("输入数据异常");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        if (sex.contains("男") || sex.contains("女")) {
            this.sex = sex;
        } else {
            throw new RuntimeException("输入数据异常");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setHeight(int height) {
        if (height < 0 || height > 300) {
            throw new RuntimeException("输入数据异常");
        } else {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        if (weight < 0 || weight > 300) {
            throw new RuntimeException("输入数据异常");
        } else {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void show(){
        System.out.println(getName() + " 性别 :"+getSex()+"  年龄 :"+getAge()+"岁");
    }

}
