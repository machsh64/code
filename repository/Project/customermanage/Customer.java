package Project.customermanage;

public class Customer {

    private String name;
    private String sex;
    private int age;
    private String number;
    private String email;

    public Customer() {
    }

    public Customer(String name, String sex, int age, String number, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.number = number;
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
