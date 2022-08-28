package Project.bookcontrol;

import java.util.Scanner;

public class User extends Person implements operate {   //user类继承person的类，  实现operate接口

    public User(int userName, int password) {
        //调用人基类的构造函数（派生类不继承基类的构造函数）
        super(userName, password);
    }

    Scanner scan = new Scanner(System.in);


    public void operate() {  //普通用户的操作

        System.out.print("请输入确认操作:");
        int i = scan.nextInt();
        switch (i) {
            case 1:
                //查
                select(books);
                break;
            case 2:
                //借
                delete(books);
                break;
            case 3:
                //还
                add(books);
                break;
            case 4:
                //书列表
                list(books);
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }


    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = scan.next();
        if (name != null) {
            boolean flag = false;
            int bookNum = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i].getName() != null && name.equals(books[i].getName())) {
                    flag = true;
                    bookNum = i;
                    break;
                }
            }
            if (!flag) {
                System.out.println("未查询到此书籍！");
            } else {
                System.out.println("书籍信息为：" + "\n" + "【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】");
                System.out.println(
                        "【" + books[bookNum].getName() + "】\t\t【" + books[bookNum].getAuthor() + "】\t\t【" + books[bookNum]
                                .getPublisher() + "】\t\t【" + books[bookNum].getCategory() + "】\t\t" + books[bookNum]
                                .getBookQuantity());
            }
        }
    }


    public void delete(Book[] books) {
        System.out.println("请输入要借阅的书名:");
        String name = scan.next();
        if (name != null) {
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].getName().equals(name)) {
                    //借走书时 给book类中bookQuantity - 1
                    if (books[i].getBookQuantity() == 0) {
                        System.out.println("【" + name + "】" + "已经被借完！");
                    } else {
                        int booksNum = books[i].getBookQuantity();
                        books[i].setBookQuantity(booksNum - 1);
                        System.out.println("借阅成功！");
                    }
                    break;
                }
            }
        }
    }

    public void add(Book[] books) {

        System.out.println("请输入要还的书名：");
        String name = scan.next();

        if (name != null) {
            int i = 0;

            if (books[i].getName().equals(name)) {
                int booksNum = books[i].getBookQuantity();
                books[i].setBookQuantity(booksNum + 1);
                System.out.println("还书成功！");
            }
        }
    }


    public void list(Book[] books) {
        System.out.println("图书列表如下:" + "\n" + "【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】");  //打印Book数组
        for (Book book : books) {
            if (book != null) {
                int bookNumber = book.getBookQuantity();
                if (bookNumber != 0) {
                    System.out.println(
                            "【" + book.getName() + "】\t\t【" + book.getAuthor() + "】\t\t【" + book.getPublisher()
                                    + "】\t\t【" + book.getCategory() + "】\t\t" + book.getBookQuantity());

                }
            }
        }
    }
}
