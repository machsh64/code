package Project.FamilyAccounts;

import java.util.Scanner;

public class FamilyAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        int balance = 0;
        String details = ("收支\t\t账户金额\t\t收支金额\t\t说   明\n");
        while (isFlag) {
            System.out.println();
            System.out.println("---------家庭收支记账软件-----------");
            System.out.println("           1,收支明细");
            System.out.println("           2,登记收入");
            System.out.println("           3,登记支出");
            System.out.println("           4,退出\n");
            System.out.print("请选择<1-4> : ");
            String word = scan.next();
            char selection = word.charAt(0);
            System.out.println();
            switch (selection) {
                case '1':
                    System.out.println("--------当前收支明细记录--------");
                    System.out.print(details);
                    System.out.println("------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额: ");
                    int income = scan.nextInt();
                    balance += income;
                    System.out.print("本次收入说明：");
                    String text = scan.next();
                    details += ("收入\t\t" + balance + "\t\t" + income + "\t\t" + text + "\n");
                    break;
                case '3':
                    System.out.print("本次支出金额: ");
                    int outcome = scan.nextInt();
                    balance -= outcome;
                    System.out.print("本次支出说明：");
                    String text2 = scan.next();
                    details += ("支出\t\t" + balance + "\t\t" + "-" + outcome + "\t\t" + text2 + "\n");
                    break;
                case '4':
                    System.out.println("你确定要退出吗? (Y/N) ");
                    String word3 = scan.next();
                    char isLoad = word3.charAt(0);
                    if (isLoad == 'y') {
                        isLoad = 'Y';
                    }
                    if (isLoad == 'n') {
                        isLoad = 'N';
                    }
                    if (isLoad == 'Y') {
                        isFlag = false;
                    }
                    break;
                default:
                    System.out.println("输入有误,请重新输入");
                    System.out.println("------------------------------");
            }


        }
    }

}


