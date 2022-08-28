package day20;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.*;


public class FileTest {
    public static void main(String[] args) {
        File sound = new File("D:\\test\\musi");
        File file = new File("D:\\eat.mp3");
        File f = new File("C:\\users\\machs\\music\\eat.mp3");

        /*boolean isOk = sound.mkdirs();
        System.out.println(isOk);
*/
/*

        try {
            boolean oLoad = file.createNewFile();
            System.out.println(oLoad);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        boolean isOK = sound.delete();
        System.out.println(isOK);

        boolean oLoad = file.delete();
        System.out.println(oLoad);

        Media _media = new Media(f.toURI().toString());

        final JFXPanel fxPanel = new JFXPanel();
        MediaPlayer _mediaPlayer = new MediaPlayer(_media);
        _mediaPlayer.play();

        File del = new File("");
        boolean Del = del.delete();
        System.out.println(Del);

    }
}

