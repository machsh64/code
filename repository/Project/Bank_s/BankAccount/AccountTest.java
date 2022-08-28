package Project.Bank_s.BankAccount;

/**
 * @author : Ren
 * @Date : 2022/06/12/22:14
 * @Param :            写一个用户程序测试AccentTest类. 在用户程序中,创建一个账号为1122, 余额为20000, 年利率 4.5%的Accent对象.
 *                     使用 widthDraw方法提款 30000元, 并打印余额,.
 *                     在使用 withDraw方法提款 2500元, 使用 deposit方法存款 3000元, 然后打印余额和月利率.
 *
 *                     [提示]: 在提款方法 widthDraw中, 需要判断用户余额是否能够满足提款数额的要求, 如果不能, 应给出提示.
 */
public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account(1122,20000,0.045);

        act.withDraw(30000);   //提款30000元
        act.withDraw(2500);    //提款2500元
        act.deposit(3000);     //存款3000元
        System.out.println("月利率为： " + act.getMonthlyInterest());    //打印月利率


    }
}
