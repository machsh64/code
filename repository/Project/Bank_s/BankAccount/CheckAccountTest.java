package Project.Bank_s.BankAccount;

/**
 * @author : Ren
 * @Date : 2022/06/12/23:30
 * @Param :       写一个用户程序测试 CheckAccountTest类.
 *                在用户程序中, 创建一个账号为: 1122, 余额为 20000, 年利率 4.5%, 可透支额度为 5000元的CheckAccount对象.
 *                使用 withDraw方法提款 5000元, 并打印账户余额和可透支额度.
 *                在使用 widthDraw方法提款 18000元, 并打印账户余额和可透支额度.
 *                在使用 widthDraw方法提款 3000元, 并打印账户余额和可透支额度.
 *
 *                [提示]: 1, 子类 CheckAccount的构造方法需从父类继承的三个属性和子类自己的属性全部初始化.
 *                       2, 父类 Account的属性 balance被设置为 private,但在子类 CheckAccount的
 *                       widthDraw方法中需要修改它的值, 因此应修改父类的 balance属性, 定义其为 protected.
 *
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount che = new CheckAccount(1122,20000,0.045,5000);

        che.withDraw(5000);     //提款 5000元
        che.withDraw(18000);    //提款 18000元
        che.withDraw(3000);     //提款 3000元

        //    输出结果 :    成功提款： 5000.0元，用户余额： 15000.0元
        //                 您的可透支余额为： 5000.0
        //                 成功提款： 18000.0元，用户余额： 0.0元
        //                 您的可透支余额为： 2000.0
        //                 提款数额：3000.0元，超出用户余额：0.0元，取款失败
        //                 您的可透支余额为： 2000.0

    }
}
