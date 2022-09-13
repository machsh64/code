package GeneralSQL;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-13 10:25
 * @description:
 **/
//负数判断自定义异常类
public class NegativeException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public NegativeException() {

    }

    public NegativeException(String msg) {
        super(msg);
    }
}
