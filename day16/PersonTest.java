package day16;

/**
 *
 *    练习7 :
 * 1,创建程序,在其中定义两个类: Person类和PersonTest类.定义如下:
 * 用setAge()设置人的合法年龄(0-130),用getAge()返回人的年龄.
 * 在PersonTest类中实例化Person类的对象b,调用setAge()和getAge()方法,
 * 体会Java的封装性
 *
 *     Person
 * -age:int
 * +setAge(age:int)
 * +getAge():int
 *
 *    练习8:
 * 1,在前面定义的Person类中添加构造器,利用构造器设置所有人的age属性初始值都为18.
 *
 * 2,修改上题中类和构造器,增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值
 *
 *     Person
 *-name:String
 * +setNAme(name:String)
 * +getName():String
 */


public class PersonTest {
    public void show(){
        Person p1 = new Person();

        System.out.println("人的年龄是 ：" + p1.getAge());
        p1.setAge(24);
        System.out.println("人的年龄是 ：" + p1.getAge());

        Person p2 = new Person(21,"jerry","男");

        System.out.println("姓名为 :"+p2.getName()+"  年龄为 ："+ p2.getAge());

    }

}
