package day18;

public class Boy {
    private String name;
    private int age;

    public Boy() {                     //空参构造器  在此之后进行带参构造器重载

    }

    public Boy(String name, int age) {         //构造器重载案例
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }   //方法重载

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶 " + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("你可以结婚了");
        } else {
            System.out.println("先谈恋爱 菜鸟");
        }
    }

}
