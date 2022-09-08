package Project.Bank_s.bankcontrol;

public class Bank {
    private Customer[] customers;      //存放多个用户数组
    private int numberOfCustomer;      //记录客户的个数

    public Bank() {
        customers = new Customer[32];
    }

    //添加客户
    public void addCustomer(String firstName, String lastName) {
        Customer cust = new Customer(firstName, lastName);
        customers[numberOfCustomer++] = cust;
    }

    //获取客户的个数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    //获取指定位置上的客户
    public Customer getCustomers(int index) {
        if (index < 0 || index > numberOfCustomer) {
            return null;
        }

        return customers[index];
    }

    //添加用户
    public void add(Bank bank,int moneyAt){
        bank.getCustomers((bank.getNumberOfCustomer() - 1)).setAccount(new Account(moneyAt));
        System.out.println("\n用户创建成功，你的卡号为 ：" + (bank.getNumberOfCustomer() - 1));
        System.out.println("现在银行总共有 " + bank.getNumberOfCustomer() + "位用户\n");
    }

    //存钱
    public void deposit(Bank bank,int number,int money){
        bank.getCustomers(number).getAccount().deposit(money);
    }

    //取钱
    public void widthDraw(Bank bank,int number,int money){
        bank.getCustomers(number).getAccount().withdraw(money);
    }

    //查询
    public void accountFind(Bank bank,int card){
        System.out.println("\n客户" + bank.getCustomers(card).getFirstName() +
                " " +
                bank.getCustomers(card).getLastName() +
                "的账户余额为 ：" +
                bank.getCustomers(card).getAccount().getBalance());
    }
}
