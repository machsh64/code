package Project;

import java.util.Scanner;

public class FamilyAccount2 {
    public static void main(String[] args) {

        Account php = new Account();
        Scanner scan = new Scanner(System.in);

        php.balance = 0;
        php.isFlag = true;
        php.details = ("收支\t\t账户金额\t\t收支金额\t\t说   明\n");

        php.mainPrint(scan);
    }

}

class Account {
    //Filed
    int balance;         //存储账户总金额
    boolean isFlag;      //二重判断
    String details;      //支出收入详细登记

    //Method

    public void mainPrint(Scanner scan) {                 //判断用户输入情况

        while (isFlag) {
            show();                     //主页面输出

            String word = scan.next();                                  //暂时保留方案,后期可进行易位
            char selection = word.charAt(0);

            switch (selection) {
                case '1':
                    showAccount();      //输出记账明细
                    break;
                case '2':
                    inCome(scan);       //收入
                    break;
                case '3':
                    outCome(scan);      //支出
                    break;
                case '4':
                    isLoad(scan);       //二层确认是否退出
                    break;
                default:
                    orEnter();          //错误输入debug
            }
        }


    }

    public void show() {                                  //主条幅
        System.out.println();
        System.out.println("----------------家庭收支记账软件-----------------");
        System.out.println("           1,收支明细");
        System.out.println("           2,登记收入");
        System.out.println("           3,登记支出");
        System.out.println("           4,退出\n");
        System.out.print("请选择<1-4> : ");
    }

    public void showAccount() {                            //输出收入明细
        System.out.println();
        System.out.println("----------------当前收支明细记录----------------");
        System.out.print(details);               //details 在main中声明
        System.out.println("----------------------------------------------");
    }

    public void inCome(Scanner scan) {                     //收入登记
        System.out.print("本次收入金额: ");
        int income = scan.nextInt();           //收入栈
        balance += income;
        System.out.print("本次收入说明：");
        String text = scan.next();
        details += ("收入\t\t" + balance + "\t\t" + income + "\t\t" + text + "\n");
    }

    public void outCome(Scanner scan) {                    //支出登记
        System.out.print("本次支出金额: ");
        int outcome = scan.nextInt();          //支出栈
        balance -= outcome;
        System.out.print("本次支出说明：");
        String text2 = scan.next();
        details += ("支出\t\t" + balance + "\t\t" + "-" + outcome + "\t\t" + text2 + "\n");
    }

    public void isLoad(Scanner scan) {                     //确认退出
        System.out.println();
        System.out.println("你确定要退出吗? (Y/N) ");
        String word3 = scan.next();
        char isLoad = word3.charAt(0);
        if (isLoad == 'y') {
            isLoad = 'Y';
        }
        if (isLoad == 'n') {           //可删除，但为了直观选择进行保留
            isLoad = 'N';
        }
        if (isLoad == 'Y') {
            isFlag = false;
        }
    }

    public void orEnter() {                              //错误输入debug
        System.out.println("输入有误,请重新输入");
        System.out.println("----------------------------------------------");
    }

}
