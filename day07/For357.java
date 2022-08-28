package day07;

/*
编写程序从1循环到150，并在每一行打印一个值，另外在每个3的倍数行
上打印出“foo”，在每个5的倍数行上打印“biz”，在每个7的倍数行上打
印“baz”。
*/
public class For357 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print(" foo");
            }
            if (i % 5 == 0) {
                System.out.print(" biz");
            }
            if (i % 7 == 0) {
                System.out.print(" baz");
            }
            System.out.println();
        }

    }

}