package GeneralSQL;

/*import Project.bookcontrol.Person;*/        //后期重导包

public class Book {
    private String name; //书名
    private String author; //作者
    private String publisher; //出版社
    private String category; //分类
    private int bookQuantity; //库存数量


    public Book(String name, String author, String publisher, String category, int bookQuantity) {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.category = category;
        this.bookQuantity = bookQuantity;
    }

    public Book() {  //默认20本书
        this(20);
    }          //可进行更改初始书籍数量,具体由实例化中的空余数目决定

    public Book(int i) {
        /*Person.books = new Book[i];*/    //可更改实例化的对象进行设置sql的创建
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

