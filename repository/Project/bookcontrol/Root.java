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
                //整理
                sort(books);
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
            case 5:
                //列表
                list(books);
                break;
            default:
                System.out.println("输入有误！");
                break;

        }
    }

    /*
     * compareable整理，重写compare to，如果数组中有空的，则会出现空指针异常，把不空的拷到另一个新的数组，然后实现
     *
     * @param books;
     */
    public void sort(Book[] books) {
        System.out.println("图书馆中的书按库存整理如下:" + "\n" + "【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookQuantity() - o2.getBookQuantity();
            }
        });
        //遍历数组打印书的列表
        for (Book book : books) {
            int bookNumber = book.getBookQuantity();
            if (bookNumber != 0) {
                System.out.println(
                        "【" + book.getName() + "】\t\t\t【" + book.getAuthor() + "】\t\t\t【" + book.getPublisher()
                                + "】\t\t\t【" + book.getCategory() + "】\t\t\t" + book.getBookQuantity());
            }
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
                System.out.println("书籍信息为：" + "\n" + "【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】\"");
                System.out.println(
                        "【" + books[bookNum].getName() + "】\t\t\t【" + books[bookNum].getAuthor() + "】\t\t\t【" + books[bookNum]
                                .getPublisher() + "】\t\t\t【" + books[bookNum].getCategory() + "】\t\t\t" + books[bookNum]
                                .getBookQuantity());
            }
        }
    }


    public void delete(Book[] books) {
        System.out.println("请输入要删除的书名:");
        String str = scan.next();
        if (str != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(str)) {
                    books[i] = null;
                    System.out.println("删除成功！");
                    break;
                }
            }
        }

    }


    public void add(Book[] books) {
        System.out.println("请输入书名：");
        String name = scan.next();
        System.out.println("请输入作者：");
        String author = scan.next();
        System.out.println("请输入出版社：");
        String publisher = scan.next();
        System.out.println("请输入分类：");
        String category = scan.next();
        System.out.println("请输入数量");

        for (Book book : books) {
            if (book.getBookQuantity()!= 0) {
            System.out.println("添加失败 最多只能添加10本新书,没有位置放置新书了\n");
            /*
              ，如需添加多余10本，需要在‘Person’类中添加更多预留位
             */
        }
            if (book.getBookQuantity() == 0) {
                int bookQuantity;
                bookQuantity = scan.nextInt();
                book.setName(name);
                book.setAuthor(author);
                book.setPublisher(publisher);
                book.setCategory(category);
                book.setBookQuantity(bookQuantity);
                System.out.println("添加成功");
                break;
            }
        }


    }


    public void list(Book[] books) {
        System.out.println("图书列表如下:" + "\n" + "【【书名】\t\t\t【作者】\t\t\t【出版社】\t\t\t【分类】\t\t\t【库存】");  //打印Book数组
        for (Book book : books) {
            if (book != null) {
                int bookNumber = book.getBookQuantity();
                if (bookNumber != 0) {
                    System.out.println("【" + book.getName() + "】\t\t\t【" + book.getAuthor() + "】\t\t\t【" + book.getPublisher()
                            + "】\t\t\t【" + book.getCategory() + "】\t\t\t" + book.getBookQuantity());

                }
            }
        }
    }
}

