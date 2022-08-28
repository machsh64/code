package day20.EndtendsMankind;

/**
 * @author : Ren
 * @Date : 2022/06/09/22:39
 * @Param :
 */

public class ManKind {
    private int sex;  //性别
    private int salary;  //薪资

    public  ManKind(){

    }

    public  ManKind(int sex, int salary){
        this.sex = sex;
        this.salary = salary;
    }
    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-09  22:49
     * @Param : [sex]
     * @Return : void
     */
    public void manOrWoman() {
        if (sex == 1) {
            System.out.println(" man ");
        } else if (sex == 0) {
            System.out.println(" woman ");
        } else {
            throw new RuntimeException("数据输入错误,请输入0/1");
        }
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-09  22:36
     * @Param : [salary]
     * @Return : void
     */
    public void employed() {
        /*if (salary == 0) {
            System.out.println(" no job ");
        } else {
            System.out.println(" job ");
        }*/
        String infoJob = (salary == 0) ? "no job" : "job";
        System.out.println(infoJob);
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-11  19:44
    *@Param : [Object]
    *@Return : int
    *
    */
    public void setSex(int sex){
        this.sex = sex;
    }

    public int getSex(){
        return sex;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
