package day32.EmployeeOS;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-02 22:48
 * @description:
 **/
public class Manager extends Employee {

    private double bonus;  //奖金

    public Manager(double bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行的效率");

    }
}

