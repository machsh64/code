package Project.BankAccount;

/**
 * @author : Ren
 * @Date : 2022/06/12/23:12
 * @Param :      创建 Account类的一个子类 CheckAccount代表可透支的账户, 该账户中定义一个属性 overDraft代表可透支限额.
 *               在 CheckAccount类中重写 withDraw方法 ,其算法如下:
 *               如果 (取款金额<账户余额),
 *               可直接取款
 *               如果 (取款金额>账户余额),
 *               计算需要透支的额度
 *               判断可透支额度 overDraft是否足够支付本次透支需要,
 *               如果可以,将账户余额修改为 0,冲减可透支金额.
 *               如果不可以,提示用户超过可透支金额的限额.
 */
public class CheckAccount extends Account {
    protected double overDraft;    //可透支金额

    public CheckAccount() {

    }

    public CheckAccount(int id, double balance, double annualPercentageRate, double overDraft) {
        super(id, balance, annualPercentageRate);
        this.overDraft = overDraft;
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-12  22:24
     * @Param : [重写取款的操作，对取款操作进行增加可透支金额的操作]
     * @Return : void
     */
    @Override
    public void withDraw(double amount) {

        if (amount > getBalance() + overDraft) {
            System.out.println("提款数额：" + amount + "元，超出用户余额：" + getBalance() + "元，取款失败\n您的可透支余额为： " + overDraft);
        } else if (amount < getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("成功提款： " + amount + "元，用户余额： " + getBalance() + "元\n您的可透支余额为： " + overDraft);
        } else {
            overDraft = overDraft + getBalance() - amount;
            setBalance(0);
            System.out.println("成功提款： " + amount + "元，用户余额： " + getBalance() + "元\n您的可透支余额为： " + overDraft);

        }
    }

}
