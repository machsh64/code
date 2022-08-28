package Project.bookcontrol;

abstract class Person {
    public int userNumber;
    public int password;
    /*
     * 	默认定义20本书籍。
     */
    public static Book[] books = new Book[]{         //实例化设置为静态变量 使对象为共享可修改状态
            new Book("西游记", "吴承恩", "东方出版社", "名著", 212),
            new Book("红楼梦", "曹雪芹", "东方出版社", "名著", 133),
            new Book("三国演义", "罗贯中", "东方出版社", "名著", 142),
            new Book("小茗", "小明", "东方出版社", "杂志", 41),
            new Book("C与指针", "老马", "东方出版社", "计算机", 21),
            new Book("Java", "甲骨文", "东方出版社", "计算机", 442),
            new Book("新世界", "陈宇", "东方出版社", "杂志", 12),
            new Book("阿衰", "阿衰", "东方出版社", "漫画", 4),
            new Book("一个人", "刘同", "东方出版社", "小说", 14),
            new Book("活着", "陈彤", "东方出版社", "小说", 51),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
    };


    public Person(int userNumber, int password) {
        this.userNumber = userNumber;
        this.password = password;
    }

    /*
     * 	抽象类中的抽象方法
     */
    public abstract void operate();      //抽象方法声明 接口
}
