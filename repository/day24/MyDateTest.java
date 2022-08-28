package day24;

import java.util.Objects;

/**
 * @author : Ren
 * @Date : 2022/08/09/13:23
 * @Param :  根据MyDateTest 自行定义能满足需要的MyDate类, 在MyDate类中覆盖equals方法,
 *           使其判断当两个MyDate类型对象的年月日都相同时,结果为true,否则为false.
 *           public boolean equals(Object obj)
 *
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14,3,1976);
        MyDate m2 = new MyDate(14,3,1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        }else {
            System.out.println("m1!=m2");
        }

        if (m1.equals(m2)){
            System.out.println("m1 is equal to m2");
        }else {
            System.out.println("m1 is not equal to m2");
        }

    }
}

class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(){
        super();

    }

    public MyDate(int day,int month,int year){
        super();
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyDate myDate = (MyDate) obj;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

}