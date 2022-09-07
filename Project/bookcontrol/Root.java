package Project.bookcontrol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Root extends Person implements operate {
    //继承Person类，重写抽象方法operate，实现operate接口，需要重写接口内的方法

    public Root(int admitNumber, int password) {
        //调用Person基类的构造函数
        super(admitNumber, password);
    }

    Scanner scan = new Scanner(System.in);

    /**
     * 管理员的操作
     */
    @Override            //接口连接
    public void operate() {
        System.out.print("请输入确认操作:");
        int i = scan.nextInt();
        switch (i) {
            case 1:
                //列表
                list(books);
                break;
            case 2:
                //查
                select(books);
                break;
            case 3:
                //加
                add(books);
                break;
            case 4:
                //删
                delete(books);
                break;
            default:
                System.out.println("输入有误！");
                break;

        }
    }

    //对书籍进行按数量整理的方法
    public static void sort(Book[] books) {
        Object[] o1 = new Object[1];
        for (int i = 0; i < Book.i - 1; i++) {
            for (int j = 0; j < Book.i - i - 1; j++) {
                if (books[j].getBookQuantity() > books[j + 1].getBookQuantity()) {
                    o1[0] = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = (Book) o1[0];
                }
            }
        }

     /*   Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookQuantity() - o2.getBookQuantity();
            }
        });*/
    }

    @Override
    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = scan.next();
        if (name != null) {
            boolean flag = false;
            int bookNum = 0;
            for (int i = 0; i < Book.i; i++) {
                if (books[i].getName() != null && name.equals(books[i].getName())) {
                    flag = true;
                    bookNum = i;
                    break;
                }
            }
            if (!flag) {
                System.out.println("未查询到此书籍！");
            } else {
                System.out.println("书籍信息为：" + "\n" + "【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】\"");
                System.out.println(
                        "【" + books[bookNum].getName() + "】\t\t\t【" + books[bookNum].getAuthor() + "】\t\t\t【" + books[bookNum]
                                .getPublisher() + "】\t\t\t【" + books[bookNum].getCategory() + "】\t\t\t" + books[bookNum]
                                .getBookQuantity());
            }
        }
    }

    @Override
    public void delete(Book[] books) {
        System.out.println("请输入要删除的书名:");
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
                for (int i = bookNum; i < books.length - 1; i++) {
                    books[i] = books[i + 1];
                }

                books[Book.i] = null;
                Book.i -= 1;

                System.out.println("已成功删除此书籍!");
            }
        }

    }

    @Override
    public void add(Book[] books) {
        boolean isFlag = false;
        int j = 0;
        System.out.println("请输入书名：");
        String name = scan.next();
        System.out.println("请输入数量");
        int bookQuantity = scan.nextInt();
        for (int i = 0; i < Book.i; i++) {
            if (books[i].getName().equals(name)) {
                isFlag = true;
                j = i;
            }
        }

        if (isFlag) {
            int book_getBookQuantity = books[j].getBookQuantity();
            book_getBookQuantity += bookQuantity;
            books[j].setBookQuantity(book_getBookQuantity);
            System.out.println("添加成功");
            sort(books);
        } else {
            System.out.println("请输入作者：");
            String author = scan.next();
            System.out.println("请输入出版社：");
            String publisher = scan.next();
            System.out.println("请输入分类：");
            String category = scan.next();
            System.out.println(books.length);
            System.out.println(Book.i);
            books[Book.i] = new Book(name, author, publisher, category, bookQuantity);
            sort(books);
        }
    }

    @Override
    public void list(Book[] books) {
        System.out.println("图书列表如下:" + "\n" + "【【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】");  //打印Book数组
        for (int i = 0; i < Book.i; i++) {
            if (books[i] != null) {
                int bookNumber = books[i].getBookQuantity();
                if (bookNumber != 0) {
                    System.out.println("【" + books[i].getName() + "】\t\t\t【" + books[i].getAuthor() + "】\t\t\t【" + books[i].getPublisher()
                            + "】\t\t\t【" + books[i].getCategory() + "】\t\t\t" + books[i].getBookQuantity());

                }
            }
        }
    }
}


