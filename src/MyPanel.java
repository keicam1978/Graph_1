import java.awt.*;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
    public MyPanel() {

        setPreferredSize(new Dimension(1000, 1000));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Os x
        g2d.drawLine(0,500,1000,500);
        // os y
        g2d.drawLine(500,0,500,1000);











    }



}