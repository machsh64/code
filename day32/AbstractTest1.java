package day32;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-02 22:22
 * @description:  abstract使用上的注意点：
 *                1，abstract不能用来修饰：属性，构造器等构造
 *
 *                2，abstract不能用来修饰：私有方法（子类不能重写父类中声明为private的方法），
 *                                      静态方法static（在定义上，子类同名同参父类的static方法不算重写），
 *                                      final的方法（final不能被重写），final的类
 **/
public class AbstractTest1 {
}
