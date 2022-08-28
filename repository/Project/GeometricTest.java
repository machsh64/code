package Project;


public class GeometricTest {
    public static void main(String[] args) {
        Circle cir1 = new Circle(3, "紫色", 12);
        Circle cir2 = new Circle(3, "紫色", 12);
        System.out.println("半径是否相等: "+cir1.equals(cir2));
        System.out.println("半径 "+cir1.toString());
        System.out.println("颜色是否相同: " + cir1.getColor().equals(cir2.getColor()));
    }
}

/**
 * @author : Ren
 * @Date : 2022/08/10/12:51
 * @Param :定义两个类, 父类GeometricObject代表几何形状,子类Circle代表圆形,
 */
class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        super();
        color = "white";
        weight = 1.0;

    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

/**
 * @author : Ren
 * @Date : 2022-08-10  13:37
 * @Param :圆的类
 */
class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-08-10  13:33
     * @Param : [计算圆的面积]
     * @Return : double
     */
    public double findArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle:{ " + "radius:" + radius + " }";
    }

}