package Project.customermanage;

import java.util.Scanner;

public class CustomerView {
    CustomerList customerList = new CustomerList();
    Scanner scan = new Scanner(System.in);

    public void show() {
        boolean isLoad = true;

        while (isLoad) {
            System.out.println("--------客户信息管理软件--------\n");
            System.out.print(
                    "        1 添加客户\n" +
                            "        2 修改客户\n" +
                            "        3 删除客户\n" +
                            "        4 客户列表\n" +
                            "        5 退   出\n\n" +
                            "        请选择(1-5): ");

            switch (readMeanSelection()) {
                case '1':
                    add();
                    break;
                case '2':
                    reset();
                    break;
                case '3':
                    delete();
                    break;
                case '4':
                    sort();
                    break;
                case '5':
                    isLoad = false;
                    break;
            }
        }
    }

    public char readMeanSelection() {
        char c;
        for (; ; ) {
            String type = scan.next();
            c = type.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.print("输入有误,请重新输入: ");
            } else {
                break;
            }
        }
        return c;
    }

    public void add() {   //添加客户
        System.out.println("----------添加客户----------");
        System.out.print("姓名 ： ");
        String name = scan.next();
        System.out.print("性别 ： ");
        String sex = scan.next();
        System.out.print("年龄 ： ");
        int age = scan.nextInt();
        System.out.print("电话 ： ");
        String number = scan.next();
        System.out.print("邮箱 ： ");
        String email = scan.next();
        customerList.addCustomer(name, sex, age, number, email);
        System.out.println("----------添加完成----------");
    }

    public void reset() {    //修改客户
        System.out.println("--------修改客户--------");
        System.out.print("请选择待修改客户编号(-1退出) ： ");
        int num = scan.nextInt();
        if (num >= 0) {
            customerList.reset(num);
        } else {
            System.out.println("-------已成功退出-------");
        }
    }

    public void delete() {   //删除客户
        for (; ; ) {
            System.out.print("输入要删除的客户编号(-1退出) ： ");
            int num = scan.nextInt();
            if (num == -1) {
                System.out.println("-------已成功退出-------");
                break;
            }
            System.out.println("你确定要删除该客户吗? (Y/N) ");
            String word = scan.next();
            char isLoad = word.charAt(0);
            if (isLoad == 'y') {
                isLoad = 'Y';
            }
            if (isLoad == 'n') {
                isLoad = 'N';
            }
            if (isLoad == 'Y') {
                customerList.delete(num);
                break;
            }
        }

    }

    public void sort() {     //遍历客户
        System.out.println("--------客户列表如下--------");
        System.out.println("编号\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t\t邮箱");
        customerList.sortCustomer();
        System.out.println("--------客户列表完成--------");
    }
}
