package day15;

/**
 * 面向对象的特征一： 封装与隐藏
 * 一 ， 问题的引入 ：
 *   当我们创建一个类的对象后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值。
 *   这里，赋值操作要受属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
 *   但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。这个条件就不能在
 *   属性声明时体现，我们只能通过方法进行限制条件的添加。（比如： setLegs）
 *   同时，我们需要避免用户再使用"对象.属性"的方法对属性进行赋值。则需要将属性声明为
 *   私有的（private）
 *
 *   --> 此时，针对于属性就体现了封装性。
 */

public class animalTest {
    public static void main(String[] args) {
        animal test = new animal();
        test.name = "大黄";
        test.eat = "吃肉";
        test.setLegs(6);
        //  test.legs = 6 因为private具有特定访问权，用户无法直接通过调用修改值，且需要同过判断进行值的确认。
        test.show();
    }
}

class animal {
    String name;
    String eat;
    private int legs;

    public void setLegs(int legs) {
        if (legs >= 0 && legs % 2 == 0) {
            this.legs = legs;
        }else{
            this.legs = 0;
        }
    }

    public int getLegs() {
        return legs;
    }

    public void show() {
        System.out.println(name + "  " + eat + "  有" + getLegs()+" 条腿");
    }
}
