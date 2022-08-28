package day13;

/*
4.对象数组题目:

定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩

score(int)。创建20个学生对象， 学号为1到20，年级和成绩都由随机数确定。

问题一:打印出3年级(state值为3)的学生信息(共有1-6年级的学生)。

问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息

1)生成随机数: Math.random()， 返回值类型double;

2)四舍五入取整: Math.round(double d)，返回值类型long。
*/
public class ExserTest {
    public static void main(String[] args) {
        Student test = new Student();

        Student[] stus = new Student[20];      //动态数值初始化
        test.giveNumber(stus);          //调用赋值
        //测试操作

        test.Print(stus);               //遍历一所有学生序号排序
        System.out.println("\n*******************************\n");
        test.searchState(stus, 3); //遍历同一个年级的学生
        System.out.println("\n*******************************\n");
        test.sort(stus);                //对学生信息的分数进行从小到大的排序
        test.Print(stus);               //输出新排序后的学生信息
    }

}

class Student {
    //属性
    int number;//学号
    int state;//年级
    int score;//分数

    //方法
    public void giveNumber(Student[] stus) {       //对学生信息进行赋值
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * 6 + 1);  //生成年级1-6（【1，7））
            stus[i].score = (int) (Math.random() * 101);       //生成分数0-100
        }
    }

    public void Print(Student[] stus) {           //遍历打印学生信息
        for (Student student : stus) {   //增强for循环: for(元素的数据类型  变量 : Collection集合或数组){ }
            System.out.println("学号 :" + student.number + "\t\t年级 ：" + student.state + "\t\t成绩 ：" + student.score);
        }
    }

    //问题一(plus):
    public void searchState(Student[] stus, int state) {
        for (Student student : stus) {
            if (student.state == state) {
                System.out.println("学号 :" + student.number + "\t\t年级 ：" + student.state + "\t\t成绩 ：" + student.score);
            }
        }
    }

    //问题二：
    public void sort(Student[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }

}
