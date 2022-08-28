package day28;

/**
 * @author : Ren
 * @Date : 2022/08/13/20:20
 * @Param :
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);

        System.out.println("c1 的 id为： " + c1.getId());
        System.out.println("c2 的 id为： " + c2.getId());

        System.out.println("创建的圆的个数为： " + Circle.getTotal());
    }
}

class Circle {
    private double radius;
    private int id;

    private static int init = 1001; //声明为static后 所有对象共享init 每次创建新对象都会对id++
    private static int total;       //记录生成对象的个数

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double findArea() { return 3.14 * Math.pow(radius, 2); }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}
