package day20.EndtendsMankind;

/**
 * @author : Ren
 * @Date : 2022/06/09/22:43
 * @Param :
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids(13);

        kid.printAge();
        kid.manOrWoman();
        kid.employed();

        ManKind man = new ManKind(1,3);
        kid = new Kids(14);
        kid.printAge();
        man.manOrWoman();
        man.employed();

        kid.setYearsOld(16);
        kid.setSex(0);
        kid.setSalary(0);
        kid.printAge();
        kid.manOrWoman();
        kid.employed();

    }
}
