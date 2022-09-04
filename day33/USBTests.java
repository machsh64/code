package day33;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-04 16:32
 * @description:      1，接口的具体使用，也要有多态性
 *                    2，实际上接口 也就是定义了一种规范
 *                    3，开发中，逐步体会面向接口编程
 **/
public class USBTests {
    public static void main(String[] args) {

        //创建了接口的  非匿名实现类，非匿名对象  *******
        Computer pc = new Computer();
        Flash flash = new Flash();

        pc.transferData(flash);   // USB usb = new Flash();   体现了接口的使用满足多态性

        System.out.println("***********************");

        //创建接口的  非匿名实现类，匿名对象  *******
        pc.transferData(new Printer());

        System.out.println("***********************");

        //创建接口的  匿名实现类，非匿名对象  *******
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };

        pc.transferData(phone);

        System.out.println("***********************");

        //创建了接口的  匿名实现类，匿名对象
        pc.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });


    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();

        System.out.println("具体传输的细节");

        usb.stop();
    }

}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("usb开始读取");
    }

    @Override
    public void stop() {
        System.out.println("usb结束读取");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

//USB接口（可以看作传输驱动）
interface USB {

    void start();

    void stop();
}

