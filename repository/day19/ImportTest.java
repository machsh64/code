
package day19;

/**
 * import关键字的使用
 * import :导入
 * 1. 在源文件中显式的使用import结构导入指定包下的类,接口
 * 2. 声明在包的声明和类之间
 * 3. 如果需要导入多个结构,则并列写出即可
 * 4. 可以使用"xxx.*"发方式,表示可以导入xxx包下的所有结构
 * 5. 如果使用的类或接口是java.lang包下定义的,则可以忽略import结构
 * 6. 如果使用的类或接口是本包下定义的,则可以忽略import结构
 * 7. 如果在源文件中,使用了不同包下的同名的类,则必须至少有一个类需要以全类名的方式显示
 * 8. 使用"xxx.*"方式表明可以调用xxx包下的所有结构,但是如果使用的是xxx子包下的结构,则仍需要显式
 *
 * 9. import static: 导入指定类或接口中的静态结构
 */

//arrays类

import java.util.Arrays;

//导入day16中的类
import day16.Person;
//  import day12.Person;   报错 因为已在day16使用了Person类名

import static java.lang.System.*;      //此时将lang包中的类已经导入,则不在需要使用System.XXX显式来使用类

public class ImportTest {
    public static void main(String[] args) {
        int[] info = new int[]{11, 2, 4, 55, 26};
        System.out.println(Arrays.toString(info));
        Arrays.sort(info);
        System.out.println(Arrays.toString(info));
        System.out.println("*********************************\n");

//从day16导过来的类
        Person person = new Person();
        person.setName("li wei wei");
        System.out.println(person.getName());

//导入同名的类时，需要以全类名的方式显示
        day12.Person person1 = new day12.Person();        //全类名
        person1.showAge();
        person1.study();
        out.println("********************************\n");

//静态结构 import static

        out.println("指定类以导入，则不需要全名显式输入");
    }

}




















