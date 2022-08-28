package Project.customermanage;

import java.util.Scanner;

public class CustomerList {
    private Customer[] customers;
    private int numberOfCustomer;

    public CustomerList() {
        customers = new Customer[32];
    }

    public void addCustomer(String name, String sex, int age, String number, String email) { //添加客户
        Customer cust = new Customer(name, sex, age, number, email);
        customers[numberOfCustomer++] = cust;
    }

    public void reset(int num) {     //修改客户信息       ......  待增添读入空格时跳过,并自动保存内容(后续内容进行完全化补充)
        Scanner scan = new Scanner(System.in);

        if (customers[num] != null) {
            System.out.print("姓名（" + customers[num].getName() + ") : ");
            String name = scan.next();
            if (name != null) {
                customers[num].setName(name);
            }
            System.out.print("性别（" + customers[num].getSex() + ") : ");
            String sex = scan.next();
            if (sex != null) {
                customers[num].setSex(sex);
            }
            System.out.print("年龄（" + customers[num].getAge() + ") : ");
            int age = scan.nextInt();
            if (age != 0) {
                customers[num].setAge(age);
            }
            System.out.print("电话（" + customers[num].getNumber() + ") : ");
            String number = scan.next();
            if (number != null) {
                customers[num].setNumber(number);
            }
            System.out.print("邮箱（" + customers[num].getEmail() + ") : ");
            String email = scan.next();
            if (email != null) {
                customers[num].setEmail(email);
            }
            System.out.println("-------修改完成-------");
        } else {
            System.out.println("该编号下没有客户");
        }
    }


    public void delete(int num) {    //删除客户信息
        if (num < customers.length) {
            customers[num] = null;
            System.out.println("-------修改成功-------");
        } else {
            System.out.println("-------该编号下无客户-------");
        }
    }

    public void sortCustomer() {    //遍历客户信息
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(i + "\t" + customers[i].getName() + "\t" + customers[i].getSex() + "\t\t" + customers[i].getAge() + "\t\t" + customers[i].getNumber() + "\t\t\t" + customers[i].getEmail());
            } else {
                continue;
            }
            System.out.println();
        }
    }
}

