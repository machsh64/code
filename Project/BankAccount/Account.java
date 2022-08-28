package Project.BankAccount;

/**
 * @author : Ren
 * @Date : 2022/06/12/22:13
 * @Param :         写一个名为Account的类模拟账户.该类的属性和方法如下.
 *                  该类包括的属性: 账号 id, 余额 balance, 年利率 annualPercentageRate.
 *                  包含的方法: 访问器方法(getter和setter方法), 返回月利率的方法 getMonthlyInterest(),
 *                  取款方法 widthDraw(), 存款方法 deposit().
 */
public class Account {
    private int id;       //账号
    private double balance;        //余额         1.2  由于CheckAccount的需要,将 private权限修改为 protected   1.3  后续可用super语句进行调用 修改回 private权限
    private double annualPercentageRate;       //年利率

    public Account() {

    }

    public Account(int id, double balance, double annualPercentageRate) {
        this.id = id;
        this.balance = balance;
        this.annualPercentageRate = annualPercentageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    public void setAnnualPercentageRate(double annualPercentageRate) {
        this.annualPercentageRate = annualPercentageRate;
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-12  22:23
     * @Param : [返回月利率的方法]
     * @Return : double
     */
    public double getMonthlyInterest() {

        return annualPercentageRate / 12;
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-12  22:24
     * @Param : [取款的操作]
     * @Return : void
     */
    public void withDraw(double amount) {

        if (amount > balance) {
            System.out.println("提款数额：" + amount + "元，超出用户余额：" + balance + "元，取款失败");
        } else {
            balance -= amount;
            System.out.println("成功提款： "+amount+"元，用户余额： "+balance+"元");
        }
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-12  22:26
     * @Param : [存款的操作]
     * @Return : void
     */
    public void deposit(double amount) {

        balance += amount;
        System.out.println("成功存款： "+amount+"元，用户余额： "+balance+"元");
    }


}
