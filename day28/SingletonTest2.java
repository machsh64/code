package day28;

/**
 * @author : Ren
 * @Date : 2022/08/14/0:08
 * @Param :          单例设计模式:
 *  *             1, 所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统中, 对某个类只能存在一个对象实例.
 *  *
 *  *             2, 如何实现?
 *  *               饿汉式 vs 懒汉式
 *
 *                3, 区分饿汉式 和 懒汉式
 *                   饿汉式： 坏处： 对象加载时间长。 /在运行前加载好创建对象
 *                           好处： 懒汉式是线程安全的
 *                   懒汉式： 好处， 延迟对象的创建。 /一边运行一边创建对象
 *  *                        目前的写法坏处， 线程不安全 ----> 到多线程内容时，再修改    /线程阻塞不安全
 */
public class SingletonTest2 {
    public static void main(String[] args) {

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }

}

//懒汉式
class Order{

    //1, 私有化类的构造器
    private Order(){
        
    }

    //2, 生命当前类对象, 没有初始化
    //4, 此对象也必须声明为static
    private static Order instance = null;

    //3, 声明public， static的返回当前类对象的方法
    public static Order getInstance(){
        /*instance = new Order();*/  //会创建多个当前类的对象
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
