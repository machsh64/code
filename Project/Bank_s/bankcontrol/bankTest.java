package Project.Bank_s.bankcontrol;

import java.util.Scanner;

public class bankTest {
    Bank bank = new Bank();
    Scanner scan = new Scanner(System.in);


    public void show() {
        boolean isLoad = true;
        while(isLoad)

        {
            System.out.print("1 创建用户\t\t2 存钱\n3 取钱\t\t\t4 查询客户\n5 退出系统\n\n请输入操作 ：");
            int i = scan.nextInt();
            System.out.println();
            switch (i) {
                case 1:
                    System.out.println("输入firstName");
                    String firstName = scan.next();
                    System.out.println("输入lastName");
                    String lastName = scan.next();
                    bank.addCustomer(firstName, lastName);
                    System.out.print("输入初始额度 ：");
                    int moneyAt = scan.nextInt();
                    bank.add(bank,moneyAt);
                    break;

                case 2:
                    System.out.print("输入卡号");
                    int number = scan.nextInt();
                    if (bank.getCustomers(number) != null) {
                        System.out.print("\n输入存钱金额 ：");
                        int money = scan.nextInt();
                        bank.deposit(bank,number,money);
                    }else {
                        System.out.println("用户不存在");
                    }
                    break;

                case 3:
                    System.out.print("输入卡号");
                    int num = scan.nextInt();
                    if (bank.getCustomers(num) != null) {
                        System.out.print("\n输入取钱金额 ：");
                        int mon = scan.nextInt();
                        bank.widthDraw(bank,num,mon);
                    }else {
                        System.out.println("用户不存在");
                    }
                    break;

                case 4:
                    System.out.print("输入客户卡号 :");
                    int card = scan.nextInt();
                    if (bank.getCustomers(card) != null) {
                        bank.accountFind(bank,card);
                    }else {
                        System.out.println("用户不存在");
                    }
                    break;

                case 5:
                    isLoad = false;
            }

        }
    }

}
