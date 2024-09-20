
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Surface extends JPanel {
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        int k = 0;
        int l = 0;

        for (int i = 1; i<=4; i++) {
            for (int x = 1; x <= 8; x++) {
                if (x % 2 == 1) {
                    g2d.setPaint(Color.black);
                } else g2d.setPaint(Color.white);
                for (int a = l; a <= l + 100; a++) {
                    g2d.drawLine(k, a, k+100, a);
                }
                l = l + 100;
            }
            k = k+200;
            l = 0;
        }

        k = 100;
        for (int i = 1; i<=4; i++) {
            for (int x = 1; x <= 8; x++) {
                if (x % 2 == 1) {
                    g2d.setPaint(Color.white);
                } else g2d.setPaint(Color.black);
                for (int a = l; a <= l + 100; a++) {
                    g2d.drawLine(k, a, k + 100, a);
                }
                l = l + 100;
            }
            k = k + 200;
            l = 0;
        }

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Dama extends JFrame {

    public Dama() {
        initUI();
    }

    private void initUI() {

        final Surface surface = new Surface();
        add(surface);

        setTitle("Dama Tahtasi");
        setSize(817, 840);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
