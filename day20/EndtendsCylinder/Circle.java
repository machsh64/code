package day20.EndtendsCylinder;

/**
 * @author : Ren
 * @Date : 2022/06/11/20:11
 * @Param :find the circle area
 */
public class Circle {
    private double radius;

    public Circle(){
        radius = 1;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-11  20:14
    *@Param : [radius]
    *@Return : double
    *
    */
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-11  20:17
    *@Param : [findArea]
    *@Return : double
    *
    */
    public double findArea(){
        return radius*radius*3.1415926;
    }

}
