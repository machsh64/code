package GeneralSQL;

import java.util.Stack;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-13 10:24
 * @description: 进制转换SQL（更新到八进制）
 **/


public class AcrossHex {

    //十进制到八进制的转换
    public static int toEightHex(int tenHex) throws RuntimeException {
        Stack<Integer> Stack = new Stack<>();

        //将十进制数转换为八进制压入栈内
        if (tenHex > 0) {
            while (tenHex > 0) {
                Stack.push(tenHex % 8);
                tenHex /= 8;
            }

            int sizeOfStack = Stack.size();    //保存栈长度
            int eightHex = 0;

            //出栈，将栈内元素转换为整数类型
            while (!Stack.isEmpty()) {
                for (int i = 0; i < sizeOfStack; i++) {
                    eightHex += Stack.pop() * Math.pow(10, Stack.size());
                }
            }
            return eightHex;
        } else {
            throw new NegativeException("数值必须为正数！");
        }

    }

    //八进制到十进制的转换
    public static int toTentHex(int eightHex) throws RuntimeException {
        Stack<Integer> Stack = new Stack<>();

        //将八进制数转换为十进制压入栈内
        if (eightHex > 0) {
            int pow = 0;
            while (eightHex > 0) {
                Stack.push(((int) (Math.pow(8, pow++)) * (eightHex % 10)));
                eightHex /= 10;
            }

            int sizeOfStack = Stack.size();   //保存栈长度
            int tenHex = 0;

            //出栈，将栈内元素转换为整数类型
            while (!Stack.isEmpty()) {
                for (int i = 0; i < sizeOfStack; i++) {
                    tenHex += Stack.pop();
                }
            }
            return tenHex;
        } else {
            throw new NegativeException("数值必须为正数！");
        }

    }

}

