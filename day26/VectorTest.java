package day26;

import GeneralSQL.Book;
import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author : Ren
 * @Date : 2022/08/12/1:48
 * @Param :
 */
public class VectorTest {

    @Test
    public void Test1() {
        Vector ver = new Vector();
        Scanner scan = new Scanner(System.in);

 /*       for(int i = 0; i < 4; i++){
            System.out.print("pleas enter:  \n");
            String str = new String(scan.next());
            ver.addElement(str);
        }

        for(int i = 0; i < ver.size(); i++){
            Object obj = ver.elementAt(i);
            String str = String.valueOf(obj);
            System.out.println(str);

        }*/
        for (int i = 0; i < 2; i++) {
            System.out.println("作者:");
            String author = scan.next();
            System.out.println("书名:");
            String name = scan.next();
            System.out.println("出版社:");
            String publisher = scan.next();
            System.out.println("种类:");
            String category = scan.next();
            System.out.println("数量:");
            int bookQuantity = scan.nextInt();

            Book book = new Book(author, name, publisher, category, bookQuantity);
            ver.addElement(book);
            System.out.println("添加成功");

        }

        for(int i = 0; i < ver.size(); i++){
            /*Object obj = ver.elementAt(i);
            Book book = (Book) obj;*/
            Book book = (Book) ver.elementAt(i);
            System.out.println(book.getName());
        }

        Book book = (Book) ver.elementAt(0);
        book.setName("changed");
        System.out.println(book.getName());
    }
}
