package Project.Bank_s.BankAccount2;

/**
 * @author : Ren
 * @Date : 2022/08/13/20:47
 * @Param : 编写一个类实现银行账户的概念, 包含的属性有"账号" , "密码" , "存款余额"
 *  * *             "利率" , "最小余额", 定义封装这些属性的方法. 账号要自动生成
 *  * *
 *  * *             编写主类, 使用银行账户类, 输入, 输出3个储户的上述信息.
 *  * *             考虑: 哪些属性可以设计成static属性
 */
public class AccountTest {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account("123456",2444);
        Account a3 = new Account();

        System.out.println("利率"+Account.getAnnualPercentageRate());
        System.out.println("最小额度"+Account.getLessBalance());

        Account.setAnnualPercentageRate(0.0123);
        Account.setLessBalance(4000);

        System.out.println("利率"+Account.getAnnualPercentageRate());
        System.out.println("最小额度"+Account.getLessBalance());

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}
