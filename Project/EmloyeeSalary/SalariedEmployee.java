package Project.EmloyeeSalary;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-03 17:56
 * @description:
 **/
public class SalariedEmployee extends Employee {
    private double monthlySalary;  //月工资

    public SalariedEmployee(String name, int number, MyDate birthday , double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
        setNum(getNum()+1);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString()+
                '}';
    }
}
