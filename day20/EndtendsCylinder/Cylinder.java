package day20.EndtendsCylinder;

/**
 * @author : Ren
 * @Date : 2022/06/11/20:11
 * @Param :
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(){
        length = 1;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-11  20:20
    *@Param : [length]
    *@Return : double
    *
    */
    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-11  20:23
    *@Param : [findVolume]
    *@Return : double
    *
    */
    public double findVolume(){
        return findArea()*length;
    }

}
