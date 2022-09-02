package Project;

import java.util.Scanner;

public class bookControl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        booksMessages bookDetail = new booksMessages();
        booksMessages[] boks = new booksMessages[2000];       //分出2000个类图书储存空间
        mainFor pageFirst = new mainFor();
        userPage user = new userPage();
        administratorPage admit = new administratorPage();

        pageFirst.isFlag = true;
        while (pageFirst.isFlag) {
            pageFirst.page();
            boolean isFlag = true;

            String word = scan.next();
            pageFirst.selection = word.charAt(0);
            switch (pageFirst.selection) {
                case '1':           //进入用户界面
                    while (isFlag) {
                        user.page(scan);             //用户第一页
                        if (user.userNumber == 20219612 && user.password == 4144) {        //验证信息 同下
                            user.lend(scan);         //用户第二页
                        } else {
                            System.out.println("\t请检查账户和密码后重试");
                            System.out.println("\t是否返回上一页? (Y/N)");
                            isFlag = isFlag(scan, true);
                        }
                    }

                    break;
                case '2':           //进入管理员界面

                    while (isFlag) {
                        admit.page(scan);         //管理员第一页
                        if (admit.admitNumber == 20219612 && admit.password == 4144) {
                            admit.control(scan);      // 管理员第二页
                        } else {
                            System.out.println("\t请检查账户和密码后重试");
                            System.out.println("\t是否返回上一页? (Y/N)");
                            isFlag = isFlag(scan, true);
                        }
                    }
                    break;
                case '3':
                    pageFirst.isLoad(scan);
                    break;
                default:            //错误输入后debug
                    System.out.println("\t输入错误 请重新输入 ：");
            }
        }

    }

    //   双重选择  退出界面使用
    static boolean isFlag(Scanner scan, boolean isFlag) {
        String word1 = scan.next();
        char isLoad = word1.charAt(0);
        if (isLoad == 'y') {
            isLoad = 'Y';
        }
        if (isLoad == 'n') {
            isLoad = 'N';
        }
        if (isLoad == 'Y') {
            isFlag = false;
        }
        return isFlag;
    }


}

//    主页面
class mainFor {
    //Filed
    char selection;      //选择界面
    boolean isFlag;

    //Method
    public void page() {
        System.out.println();
        System.out.println("----------------图书管理系统-----------------");
        System.out.println("\t1,进入用户界面           2,进入管理员界面");
        System.out.println();
        System.out.println("\t3,退出系统");
        System.out.print("\t请选择<1-3> : ");
    }

    public void isLoad(Scanner scan) {        //确认退出
        System.out.println();
        System.out.println("\t你确定要退出吗? (Y/N) ");
        isFlag = bookControl.isFlag(scan, isFlag);
    }

}


//    用户页面
class userPage {
    //Filed
    int userNumber;
    int password;
    char selection;

    //Method
    //    用户第一页
    public void page(Scanner scan) {
        System.out.println();
        System.out.println("----------------用户界面--------------------");
        System.out.println();
        System.out.println("\t(借阅号:20219612   密码4144)");
        System.out.print("\t请输入借阅号: ");
        userNumber = scan.nextInt();
        System.out.println();
        System.out.print("\t请输入密码： ");
        password = scan.nextInt();
    }

    //    用户第二页
    public void lend(Scanner scan) {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("----------------用户界面--------------------");
            System.out.println("\t1,借书           2,还书\n");
            System.out.println("\t3,退出");
            String word = scan.next();
            selection = word.charAt(0);
            switch (selection) {
                case '1':
                    /*   borrowBook(boks);*/
                    break;
                case '2':
                    returnBook();
                    break;
                case '3':
                    System.out.println("\t是否返回上一页? (Y/N)");
                    isFlag = bookControl.isFlag(scan, true);
                    break;
                default:
                    System.out.println("\t输入错误 请重新输入 ：");
            }
        }


    }

    public void borrowBook(booksMessages[] boks) {
        System.out.println("\t输入所要借阅图书的编号");
        System.out.println(boks[1].bookNumber + boks[1].bookName);


    }

    public void returnBook() {
        System.out.println("用户还书示范");
    }

}

//    管理员页面
class administratorPage {
    //Filed
    int admitNumber;
    int password;
    char selection;

    //Method
    //   管理员第一页
    public void page(Scanner scan) {
        System.out.println();
        System.out.println("----------------管理员界面-------------------");
        System.out.println();
        System.out.println("\t(管理员账号:20219612   密码4144)");
        System.out.print("\t管理员账号: ");
        admitNumber = scan.nextInt();
        System.out.println();
        System.out.print("\t请输入密码： ");
        password = scan.nextInt();
    }

    //    管理员第二页
    public void control(Scanner scan) {

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("----------------管理员界面-------------------");
            System.out.println("\t1,新书入库           2,清空库存");
            System.out.println();
            System.out.println("\t3,查看库存           任意键退出");
            String word = scan.next();
            selection = word.charAt(0);
            switch (selection) {
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                default:
                    System.out.println("\t是否返回上一页? (Y/N)");
                    isFlag = bookControl.isFlag(scan, true);
                    break;
            }
        }

    }
}


//储存图书信息
class booksMessages {
    //Filed
    int bookNumber;
    String bookName;
    String author;
    String publisher;
    int booksQuantity;

    //Method
    public void books(booksMessages boks[]) {
        boks[1] = new booksMessages();
        boks[1].bookNumber = 2011;
        boks[1].bookName = "阿里巴巴";
    }
}





