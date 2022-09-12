package SwingPage;

import java.io.IOException;
import java.util.Scanner;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-12 13:25
 * @description:
 **/
public class PageFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("输入要登录的网址url：");
        String url = scan.next();
        openURL(url);
    }

    public static void openURL(String url) {
        String os = System.getProperty("os.name");
        // Linux
        if (os.indexOf("Linux") != -1) {
            try {
                String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                if (browser != null) {
                    Runtime.getRuntime().exec(new String[]{browser, url});
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        // Windows
        } else {
            String cmd = "rundll32 url.dll,FileProtocolHandler http://" + url;
            try {
                Runtime.getRuntime().exec(cmd);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
