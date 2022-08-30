package day30;

/**
 * @program: code
 * @description:
 * @author: Ren
 * @create: 2022-08-30 09:29
 **/
public class leafTest {
    public static void main(String[] args) {
        leaf l1 = new leaf();    //静态代码块与非静态代码块均进行了表达
        l1.show();
        leaf l2 = new leaf();    //实例化第二个对象则只表达了非静态代码块
    }
}

class leaf {
    private int id = 1001;
    private String name = "zhangwei";

    static {
        System.out.println("静态代码块测试");

    }

    {
        System.out.println("非静态代码块测试");

    }

    public leaf() {
        super();
    }

    public leaf(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("id +" + id);
        System.out.println("name +" + name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}