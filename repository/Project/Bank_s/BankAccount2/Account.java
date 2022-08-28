package Project.Bank_s.BankAccount2;

/**
 * @author : Ren
 * @Date : 2022/08/13/20:47
 * @Param :   编写一个类实现银行账户的概念, 包含的属性有"账号" , "密码" , "存款余额"
 * *             "利率" , "最小余额", 定义封装这些属性的方法. 账号要自动生成
 * *
 * *             编写主类, 使用银行账户类, 输入, 输出3个储户的上述信息.
 * *             考虑: 哪些属性可以设计成static属性
 */
public class Account {

    private int id;  //id
    private static int inti = 1001;  // 共项
    private String passWord;       //密码
    private double balance;        //余额
    private  static double annualPercentageRate = 0.03;  //利率
    private  static double lessBalance = 3000;   //最小余额

    public Account() {
        id = inti++;
        passWord = "000000";
    }

    public Account(String passWord, double balance) {
        this();
        this.passWord = passWord;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (this.balance < lessBalance) {
            System.out.println("您最低存款应为: " + lessBalance);
        } else {
            this.balance = balance;
        }
    }

    public static double getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    public static void setAnnualPercentageRate(double annualPercentageRate){
        Account.annualPercentageRate = annualPercentageRate;
    }

    public static double getLessBalance() {
        return lessBalance;
    }

    public static void setLessBalance(double lessBalance) {
        Account.lessBalance = lessBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", passWord='" + passWord + '\'' +
                ", balance=" + balance +
                '}';
    }
}
