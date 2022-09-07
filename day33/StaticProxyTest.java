package day33;

import java.io.IOException;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-06 11:11
 * @description:     接口的应用模板：代理模式
 **/
public class StaticProxyTest {

    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec(new String[]{"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe","www.4399.com"});
        Star s = new ProxyManager(new RealStar());
        s.confer();
        s.singContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();

    }
}

interface Star {
    void confer();      //面谈

    void singContract();    //签合同

    void bookTicket();     //订票

    void sing();     //唱歌

    void collectMoney();    //收钱
}

class RealStar implements Star {

    @Override
    public void confer() {

    }

    @Override
    public void singContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("Real明星唱歌~~~~");
    }

    @Override
    public void collectMoney() {

    }
}

class ProxyManager implements Star {
    private Star real;

    public ProxyManager(Star real) {
        this.real = real;
    }

    @Override
    public void confer() {
        System.out.println("代理人面谈");
    }

    @Override
    public void singContract() {
        System.out.println("代理人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("代理人订票");
    }

    @Override
    public void sing() {
        real.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("代理人收钱");
    }
}
