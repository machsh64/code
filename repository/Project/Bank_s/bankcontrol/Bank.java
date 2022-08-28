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
}
