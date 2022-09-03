package Project.EmloyeeSalary;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-03 17:57
 * @description:
 **/
public class HourlyEmployee extends Employee {
    private double wage;    //时薪
    private double hour;    //公时

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
        setNum(getNum()+1);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
        setNum(getNum()+1);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "}";
    }
}
