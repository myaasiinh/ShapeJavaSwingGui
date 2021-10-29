package guishape;

import javax.swing.*;
import java.awt.*;

public class shape extends JFrame {

    public shape() {
        frameInit();
    }

    public void paint(Graphics gambarkan) {

        gambarkan.setColor(Color.blue);
        gambarkan.drawLine(20, 100, 100, 100);
        gambarkan.drawRect(300, 100, 100, 100);
        gambarkan.drawOval(600, 100, 100, 100);
        gambarkan.drawRect(300, 300, 100, 100);
        gambarkan.drawOval(600, 300, 100, 100);

    }

    public static void main(String args[]) {
        guishape.shape frame = new shape();
        frame.setBounds(30, 30, 800, 600);
        frame.setVisible(true);

    }
}
