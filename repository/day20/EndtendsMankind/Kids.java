package day20.EndtendsMankind;

/**
 * @author : Ren
 * @Date : 2022/06/09/22:37
 * @Param :
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-09  22:47
     * @Param : [打印出人的年龄]
     * @Return : void
     */
    public void printAge() {
        System.out.println(" " + yearsOld);
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-12  11:05
    *@Param : [练习二进行的修改]
    *@Return : void
    *
    */
    public void employed() {
        System.out.println("kids should study and no job");
    }
}
