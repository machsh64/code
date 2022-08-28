package day20.EndtendsCylinder;

/**
 * @author : Ren
 * @Date : 2022/06/11/20:23
 * @Param :
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(4.233);
        double area = cylinder.findArea();
        System.out.println("area is " + area);
        cylinder.setLength(3);
        double volume = cylinder.findVolume();
        System.out.println("volume is " + volume);

    }
}
