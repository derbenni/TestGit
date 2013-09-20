package halloBenni;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGUI
    extends JFrame
{

    public TestGUI()
    {
        JPanel red = new JPanel();
        red.setBorder(BorderFactory.createTitledBorder("red"));
        red.setBackground(Color.RED);
        red.setPreferredSize(new Dimension(100, 100));

        JPanel yellow = new JPanel();
        yellow.setBorder(BorderFactory.createTitledBorder("yellow"));
        yellow.setBackground(Color.YELLOW);
        yellow.setPreferredSize(new Dimension(100, 100));
        yellow.setOpaque(true);

        JPanel blue = new JPanel();
        blue.setBorder(BorderFactory.createTitledBorder("blue"));
        blue.setBackground(Color.BLUE);

        blue.add(red);
        blue.add(yellow);

        add(blue);
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new TestGUI();
    }
}