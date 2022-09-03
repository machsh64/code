package Project.EmloyeeSalary;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-03 17:56
 * @description:
 **/
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    private static int num;    //创建全句静态变量记录实例化的员工数量

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Employee.num = num;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

}
