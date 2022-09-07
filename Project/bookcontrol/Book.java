package Project.bookcontrol;

public class Book {
    private String name; //书名
    private String author; //作者
    private String publisher; //出版社
    private String category; //分类
    private int bookQuantity; //库存数量
    public static int i = 10;  //书架存放书的种类数量  设置为全局静态变量 初始数量由Person类中书类决定

    //属性
    public Book(String name, String author, String publisher, String category, int bookQuantity) {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.category = category;
        this.bookQuantity = bookQuantity;

        i++;    //每次创建新书后自动增加一个书架位
    }

    public Book(int num) {
        //可更改实例化的对象进行设置sql的创建
        Person.books = new Book[num];
    }

    //属性的获取和设置
    public String getName() {         //用get 和 set进行封装属性
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) { this.bookQuantity = bookQuantity; }

}

