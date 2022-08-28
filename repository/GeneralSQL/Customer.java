package GeneralSQL;

import java.util.Objects;

/**
 * @author : Ren
 * @Date : 2022/08/05/12:48
 * @Param :
 */
public class Customer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(){
        super();
    }

    public Customer(String name,int age) {
        super();
        this.name = name;
        this.age = age;
    }

/*    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj instanceof Customer){
            Customer cust = (Customer)obj;
            //比较两个对象的属性是否都相同
    *//*        if(this.age == cust.age && this.name.equals(cust.name)){
                return true;
            }else {
                return false;
            }*//*
            return this.age == cust.age && this.name.equals(cust.name);
        }else
            return false;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);

    }


    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}
