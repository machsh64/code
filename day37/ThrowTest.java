package day37;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-12 14:59
 * @description:
 **/
public class ThrowTest {
    public static void main(String[] args) {

        try{
            Student stu = new Student();

            stu.regist(1001);
            System.out.println(stu);

            stu.regist(-1001);
            System.out.println(stu);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}

class Student{
    private int id;

    public void regist(int id) throws Exception{
        if (id > 0) {
            this.id = id;
        }else {
           /* System.out.println("您输入的数据异常");*/
            //手动抛出异常
            /*throw new RuntimeException("您输入的数据非法");*/

            throw new Exception("您输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
