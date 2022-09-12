package day38;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-12 15:45
 * @description:
 **/
public class StudentTest {
    public static void main(String[] args){

        try {
            Student stu = new Student();
            stu.regist(-11);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class Student{
    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            /* System.out.println("您输入的数据异常");*/
            //手动抛出异常
            /*throw new RuntimeException("您输入的数据非法");*/

            /*throw new Exception("您输入的数据非法");*/

            //提供自定义异常类
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}

