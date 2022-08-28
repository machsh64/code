package day24;

import java.util.Objects;

/**
 * @author : Ren
 * @Date : 2022/08/05/13:45
 * @Param :编写Order类, 有 int型 的orderID, String型 的orderName, 相应的getter() 和setter() 方法,
 *         俩个参数的构造器,重写父类的equals()方法 :public boolean equals(Object obj) .并测试父类中
 *         创建的两个对象是否相等
 *
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(12,"tom");
        Order o2 = new Order(12,"tom");
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
    }

}

class Order {
    private int orderId;
    private String orderName;

    public Order(){
        super();

    }

    public Order(int orderId,String orderName){
        super();
        this.orderId = orderId;
        this.orderName = orderName;

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }


}
