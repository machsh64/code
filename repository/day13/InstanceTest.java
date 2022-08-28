package day13;

/*
 * mi名对象的使用
 * 1，理解： 我们创建的对象，没有显式的赋给一个变量名。即为mi名对象
 * 2，特征： mi名对象只能调用一次,第二次则为另一个
 * 3，使用： 如下
 *  */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);   //显示的是地址值

        p.sendEmail();
        p.playGame();

        //mi名对象
/*
        new Phone().sendEmail();
        new Phone().playGame();
*/
        new Phone().price = 2999;
        new Phone().showPrice();  //0.0

        //****************************
        PhoneMall mall = new PhoneMall();
        //mall.show(p);
        //3 ：mi名对象的使用
        mall.show(new Phone());
    }

}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone {
    double price;        //价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println("手机的价格为： " + price);
    }
}

