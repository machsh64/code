package Project.EmloyeeSalary;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-03 17:58
 * @description:
 **/
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：输入
       /* Scanner scan = new Scanner(System.in);
        System.out.println("请输入当月月份：");
        int month = scan.nextInt();*/
        //方式二：自动获取
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;//获取当前的月份,该月份从0月开始，故使用时需要+1

        Employee[] e = new Employee[10];

        e[0] = new SalariedEmployee("john", 1001, new MyDate(2002, 9, 22), 12000);
        e[1] = new HourlyEmployee("keke", 1002, new MyDate(2003, 12, 22), 50, 300);

        for (int i = 0; i < Employee.getNum(); i++) {
            System.out.println(e[i].toString());
            double salary = e[i].earnings();
            if (month == e[i].getBirthday().getMonth()) {
                salary += 100;
            }
            System.out.println("月工资为：" + salary);
        }

    }

}
