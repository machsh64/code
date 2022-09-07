package Project.bookcontrol;

import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);

    static{       //利用静态代码块加载全局只运行一次的必要过程
        Person.book();       //使默认书籍加载出来   后期可对此段代码进行优化
        Book.i -=10;
        Root.sort(Person.books);       //默认初始整理一次书籍
    }

    //登录函数：显示登录界面进行选择登录
    public void loge() {
        int count = 0;
        Person p = null;
        while (count < 2) {
            System.out.println();
            System.out.println("----------------图书管理系统-----------------");
            System.out.println("\t1,进入用户界面           2,进入管理员界面");
            System.out.println();
            System.out.println("\t3,退出系统");
            System.out.print("\t请选择<1-3> : ");

            int n = scan.nextInt();  //通过输入的值进行登录判断
            if (n == 3) {
                return;
            }
            switch (n) {
                case 1:
                    boolean isFlag1 = true;
                    while (isFlag1) {
                        System.out.println();
                        System.out.println("----------------用户界面--------------------");
                        System.out.println();
                        System.out.println("\t(借阅号:20219612   密码4144)");
                        System.out.print("\t请输入借阅号: ");
                        int userNumber = scan.nextInt();
                        System.out.println();
                        System.out.print("\t请输入密码： ");
                        int password = scan.nextInt();
                        if (userNumber == 20219612 && password == 4144) {
                            while (true) {
                                p = new User(userNumber, password);      //new 出用户对象
                                System.out.println("----------------用户界面--------------------");
                                System.out.println("\t1,查阅书籍           2,借阅书籍\n");
                                System.out.println("\t3,归还书籍           4,显示书籍\n");
                                System.out.println("\t5,退出");
                                int i = scan.nextInt();
                                if (i == 5) {
                                    System.out.println("\t您已成功退出! ");
                                    break;
                                } else {
                                    p.operate();      //调用用户对象
                                }
                            }
                        } else {
                            System.out.println("\t请重新检查借阅号或密码 ！ ");
                            System.out.println("是否退出 ?(Y/N)");
                            String word1 = scan.next();
                            char isLoad = word1.charAt(0);
                            if (isLoad == 'y') {
                                isLoad = 'Y';
                            }
                            if (isLoad == 'n') {
                                isLoad = 'N';
                            }
                            if (isLoad == 'Y') {
                                isFlag1 = false;
                            }
                        }
                    }
                    break;
                case 2:
                    boolean isFlag2 = true;
                    while (isFlag2) {
                        System.out.println();
                        System.out.println("----------------管理员界面-------------------");
                        System.out.println();
                        System.out.println("\t(管理员账号:20219612   密码4144)");
                        System.out.print("\t管理员账号: ");
                    //    int admitNumber = scan.nextInt();
                        System.out.println();
                        System.out.print("\t请输入密码： ");
                      //  int password = scan.nextInt();
                        //if (admitNumber == 20219612 && password == 4144) {
                            while (true) {
                                p = new Root(222, 222);   //new 出管理员对象
                                System.out.println("----------------管理员界面-------------------");
                                System.out.println("\t1,图书信息           2,查询书籍");
                                System.out.println();
                                System.out.println("\t3,新书入库           4,删除书籍");
                                System.out.println();
                                System.out.println("\t5,退出");
                                int i = scan.nextInt();
                                if (i == 5) {
                                    System.out.println("\t您已成功退出! ");
                                    break;
                                } else {
                                    p.operate();    //调用管理员页面
                                }
                            }
                        //} else {
                            System.out.println("\t请重新检查管理员账号或密码 ！ ");
                            System.out.println("是否退出 ?(Y/N)");
                            String word1 = scan.next();
                            char isLoad = word1.charAt(0);
                            if (isLoad == 'y') {
                                isLoad = 'Y';
                            }
                            if (isLoad == 'n') {
                                isLoad = 'N';
                            }
                            if (isLoad == 'Y') {
                                isFlag2 = false;
                            }
                        }
                    //}
                    break;
            }
        }
    }
}
