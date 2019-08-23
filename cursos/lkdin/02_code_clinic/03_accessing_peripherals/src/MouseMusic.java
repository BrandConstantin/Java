import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import org.jfugue.*;

public class MouseMusic implements Runnable {
    public Object lock = new Object();
    public MouseMusic() {}

    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                while(MouseChecker.m) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Player player = new Player();
            Point loc = MouseInfo.getPointerInfo().getLocation();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            int pitch = 127 - (int) (loc.y * 127 / height);
            int volume = (int) (loc.x * 16383 / width);
            player.play("X[Volume]=" + volume + " [" + pitch + "]");
        }
    }
}
