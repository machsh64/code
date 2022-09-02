package day23;

/**
 * @author : Ren
 * @Date : 2022/06/16/22:46
 * @Param :
 */
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        test.equalsArea(new Circle(3.2,"紫色",5),new MyRectangle(3,4,"红色",5));
        test.displayGeometricObject(new Circle(3.2,"紫色",5),new MyRectangle(3,4,"红色",5));

    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-16  23:07
    *@Param : [测试两个对象的面积是否相等]
    *@Return : void
    *
    */
    public void equalsArea(GeometricObject cir,GeometricObject myr){

         if (cir.findArea() != myr.findArea()){
             System.out.println("两个对象面积不相等");
         }else{
             System.out.println("两个对象面积相等");
         }
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-16  23:08
    *@Param : [显示对象的面积]
    *@Return : void
    *
    */
    public void displayGeometricObject(GeometricObject cir,GeometricObject myr){

        System.out.println("圆的面积是： "+cir.findArea());
        System.out.println("矩形的面积是： "+myr.findArea());
    }
}

/**
*@author : Ren
*@Date : 2022-06-16  22:47
*@Param : 父类代表几何形状
*
*/
abstract class GeometricObject{

    protected String color;   //颜色
    protected double weight;  //宽

    public GeometricObject(){

    }

    public GeometricObject(String color,double weight){
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

   /* public double findArea(){     //多态学习时期未掌握抽象类方法，不得不设置return 0；将方法保留
        return 0;
    }*/

    public abstract double findArea();       //学习抽象类方法后，可以先将由未知子类设立，不确定方法体的方法修饰为抽象类方法，同时GeometricObject类也必须修饰为抽象类
}

/**
*@author : Ren
*@Date : 2022-06-16  22:48
*@Param : 代表圆形
*
*/
class Circle extends GeometricObject{

    private double radius;   //半径

  public Circle(){

  }

  public Circle(double radius,String color,double weight){
      super(color,weight);
      this.radius = radius;
  }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-16  23:10
    *@Param : [计算园的面积]
    *@Return : double
    *
     * @return
     */
    @Override
    public double findArea() {

        return radius*radius*Math.PI;
  }

}

/**
*@author : Ren
*@Date : 2022-06-16  22:50
*@Param :代表矩形
*
*/
class MyRectangle extends GeometricObject{

    private double width;   //宽
    private double height;  //长

    public MyRectangle(){

    }

    public MyRectangle(double width,double height,String color,double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-16  23:20
    *@Param : [计算矩形面积]
    *@Return : double
    *
     * @return
     */
    @Override
    public double findArea() {

        return width*height;
    }
}
