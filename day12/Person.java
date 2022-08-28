package day12;

public class Person {
    String name;
    int age;
    /**
     * 当sex为1时性别为男,为0时性别为女
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age: " + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
