package Project.bookcontrol;

abstract class Person {
    /*
     * 	默认定义10本书籍。
     */
    public static Book[] books = new Book[Book.i];

    //静态化方法造静态数组，为书库添加默认的书本
    public static void book() {
        books[0] = new Book("西游记", "吴承恩", "东方出版社", "名著", 212);
        books[1] = new Book("红楼梦", "曹雪芹", "东方出版社", "名著", 133);
        books[2] = new Book("三国演义", "罗贯中", "东方出版社", "名著", 142);
        books[3] = new Book("小茗", "小明", "东方出版社", "杂志", 41);
        books[4] = new Book("C与指针", "老马", "东方出版社", "计算机", 21);
        books[5] = new Book("Java", "甲骨文", "东方出版社", "计算机", 442);
        books[6] = new Book("新世界", "陈宇", "东方出版社", "杂志", 12);
        books[7] = new Book("阿衰", "阿衰", "东方出版社", "漫画", 4);
        books[8] = new Book("一个人", "刘同", "东方出版社", "小说", 14);
        books[9] = new Book("活着", "陈彤", "东方出版社", "小说", 51);
    }


    private final int userNumber;
    private final int password;

    public Person(int userNumber, int password) {
        this.userNumber = userNumber;
        this.password = password;
    }

    /*
     * 	抽象类中的抽象方法
     */
    public abstract void operate();      //抽象方法 接口的功能 暂时不能规范用户与管理员操作范围，在对应子类进行重写
}
