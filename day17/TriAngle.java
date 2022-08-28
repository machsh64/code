package day17;

public class TriAngle {
    private double base;
    private double height;

    public TriAngle(){

    }

    public TriAngle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
       if(base < 0){
           throw new RuntimeException("输入数据应大于0");
       }else{
           this.base = base;
       }
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        if(height < 0){
            throw new RuntimeException("输入数据应大于0");   //抛出一个异常警告
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
}
