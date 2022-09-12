package day38;

import java.util.InputMismatchException;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-12 16:02
 * @description:
 **/
public class EcmDef {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int result = ecm(a, b);

            System.out.println(result);
        } catch (NumberFormatException e) {   //数据类型不一致
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {   //缺少命令行参数
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {    //除0异常
            System.out.println("分母不能为0");
        } catch (negativeNumException e) {   //负数异常
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int a, int b) throws negativeNumException {

        if (a < 0 || b < 0) {
            throw new negativeNumException("不能输入负数");
        }
        return a / b;
    }
}

class negativeNumException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public negativeNumException() {

    }

    public negativeNumException(String msg) {
        super(msg);
    }
}
