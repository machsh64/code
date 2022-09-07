package day33;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-07 23:55
 * @description: 定义一个接口用来实现两个对象的比较。
 **/
public class CircleInterface {
    public static void main(String[] args) {
        CompareObject o1 = new ComparableCircle(3.133);
        CompareObject o2 = new ComparableCircle(3.133);


        System.out.println(o1.compareTo(o2));
    }

}

interface CompareObject {
    int compareTo(Object o);  //若返回值为0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
}

class Circle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class ComparableCircle extends Circle implements CompareObject {
    int num;

    public ComparableCircle(double radius) {
        this.setRadius(radius);
    }

    @Override
    public int compareTo(Object o) {

        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            if (this.getRadius() > c.getRadius()) {
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            } else if (this.getRadius() == c.getRadius()) {
                return 0;
            }
        }
            throw new RuntimeException("传入类型不匹配");
    }

}
