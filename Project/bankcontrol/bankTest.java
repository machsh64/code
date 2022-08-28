package Project.bankcontrol;

import Project.bankcontrol.Account;
import Project.bankcontrol.Bank;

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
                    bank.getCustomers((bank.getNumberOfCustomer() - 1)).setAccount(new Account(moneyAt));
                    System.out.println("\n用户创建成功，你的卡号为 ：" + (bank.getNumberOfCustomer() - 1));
                    System.out.println("现在银行总共有 " + bank.getNumberOfCustomer() + "位用户\n");
                    break;

                case 2:
                    System.out.print("输入卡号");
                    int number = scan.nextInt();
                    System.out.print("\n输入存钱金额 ：");
                    int money = scan.nextInt();
                    bank.getCustomers(number).getAccount().deposit(money);
                    break;

                case 3:
                    System.out.print("输入卡号");
                    int num = scan.nextInt();
                    System.out.print("\n输入取钱金额 ：");
                    int mon = scan.nextInt();
                    bank.getCustomers(num).getAccount().withdraw(mon);
                    break;

                case 4:
                    System.out.print("输入客户卡号 :");
                    int card = scan.nextInt();
                    System.out.println("\n客户" + bank.getCustomers(card).getFirstName() +
                            " " +
                            bank.getCustomers(card).getLastName() +
                            "的账户余额为 ：" +
                            bank.getCustomers(card).getAccount().getBalance());
                    break;

                case 5:
                    isLoad = false;
            }

        }
    }

}
