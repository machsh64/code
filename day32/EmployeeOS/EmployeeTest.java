package day32.EmployeeOS;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-02 22:49
 * @description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("库克",1001,5000,50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

        Employee employee = new Manager(5000);
        employee.work();

        work(new Manager(5000));

    }

    public static void work(Employee employee){
        employee.work();
    }
}


//单例设计模式复习
class Singleton{

    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){return instance;}
}

class Singleton1{

    private Singleton1(){

    }

    private static Singleton1 instance = null;

    public static Singleton1 getInstance(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}


