package day18;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("王立威", 23);
        boy.shout();
        System.out.println();

        Girl girl = new Girl("张佳", 22);
        girl.marry(boy);
        System.out.println();

        Girl girl1 = new Girl("栀子", 16);
        girl1.marry(boy);
        System.out.println();
        
        int compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getName() + "年龄大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "年龄大");
        } else {
            System.out.println(girl.getName() + "和" + girl1.getName() + "年龄大");
        }


    }
}
