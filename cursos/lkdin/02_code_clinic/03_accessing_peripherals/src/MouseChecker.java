import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseChecker extends JPanel implements MouseListener, Runnable {
    private static final long serialVersionUID = 1L;
    public static boolean m = true;
    public MouseMusic music;
    public MouseChecker() {}

    public void mousePressed(MouseEvent e) {
        m = false;
        synchronized (music.lock) {
            music.lock.notifyAll();
        }
    }

    public void mouseReleased(MouseEvent e) {
        m = true;
        synchronized (music.lock) {
            music.lock.notifyAll();
        }
    }

    @Override
    public void mouseClicked(MouseEvent paramMouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent paramMouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent paramMouseEvent) {
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("MouseMusic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = this;
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
        addMouseListener(this);
        music = new MouseMusic();
        new Thread(music).start();
    }
}
