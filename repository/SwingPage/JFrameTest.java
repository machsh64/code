package SwingPage;


import javax.swing.*;
import java.awt.*;

/**
 * @author : Ren
 * @Date : 2022/06/14/1:40
 * @Param :   Swing窗口的创建
 */
public class JFrameTest {
    public static void main(String[] args) {

        //以下是窗口的创建
        JFrame jf = new JFrame();   //JFrame(String s)  内部可传参 为String类型， 是生成的窗口的标题
        // jf.setLocation(100, 300);       //设置窗口初始位置
        // jf.setSize(400, 300);    //设置窗口大小
        //以上均可以由以下创立
        jf.setBounds(100, 300, 400, 300);   //  初始位置  与  窗口大小

        jf.setVisible(true);      //窗口的可视化  默认为不可视 false
        jf.setResizable(false);   //设置窗口是否可调整大小  默认为可调整 true

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //设置窗口关闭按钮的作用  EXIT为关闭  HIDE为隐藏  DO—NOTHING为不做出操作  DISPOSE为隐藏窗口且释放资源

        jf.setTitle("这是一个Swing窗口");       //设置窗口名

        //以下是窗口 子窗口的创建
        JDialog jd = new JDialog(jf); //JDialog(JFrame (),String s)  需要将父类窗口传递进去  内部可传参 为String类型， 是生成的子窗口的标题
        jd.setBounds(300, 100, 200, 150);

        jd.setVisible(true);      //窗口的可视化  默认为不可视 false
        jd.setResizable(false);   //设置窗口是否可调整大小  默认为可调整 true

        jd.setVisible(true);
        jd.setResizable(false);

        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  //子窗口建议为隐藏且释放内存

        jd.setTitle("这是子窗口");

        //以下是按钮的生成
           //一 ： JPanel方式  JPanel是最简单的面板， 可创立多个按钮
        // JButton jb1 = new JButton("按钮一");   //JButton(String s)  内部可传参 为String类型， 是生成的按钮的标题
        // JButton jb2 = new JButton("按钮二");

        JPanel jp = new JPanel(new FlowLayout());       //创建一片区域  JPanel() 内部可加入实例化区域框架

        Container ctP = jf.getContentPane();     //     用Container创建区域
        ctP.setLayout(new BorderLayout());       //     使用 BorderLayout()布局组件

        //   jp.add(jb1);        //用 Jpanel的最简单方式添加按钮
        //   jp.add(jb2);
        jp.add(new JButton("按钮一"),BorderLayout.EAST);        //将按钮加入区域jp
        jp.add(new JButton("按钮二"),BorderLayout.WEST);
        jf.add(jp);         //将这片区域加入父窗口jf

        jf.setVisible(true);  // Swing bug需要将可视化语句后移， 否则导致按钮不可见

           //二 ： JScrollPane方式 JScrollPane是带滚动条的面板， 要将一个大的组件放到一个较小的空间时使用该面板， 该面板只能添加一个组件， 若要添加多个组件， 则首先将组件添加到JPanel中， 再将JPanel添加到JScrollPane中
        JButton jb3  = new JButton("按钮三");
        jb3.setSize(350,250);

        JScrollPane jsp = new JScrollPane(jb3);
        jd.add(jsp);        //将这片区域添加到子窗口jd

        jd.setVisible(true);  // Swing bug需要将可视化语句后移， 否则导致按钮不可见




    }
}
