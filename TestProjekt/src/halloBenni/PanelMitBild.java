package halloBenni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMitBild {
	public PanelMitBild() {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setBackground(Color.white);

		MyPanel panel = new MyPanel(Toolkit.getDefaultToolkit().getImage("pergament.png"));
		panel.add(new JButton("Huhu"));
		panel.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setBackground(Color.green);
		p.setOpaque(false);
		JLabel label = new JLabel("UUUUUU");
		p.add(label);

		panel.add(p, BorderLayout.CENTER);

		f.setContentPane(panel);

		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new PanelMitBild();
	}

	class MyPanel extends JPanel {

		private Image image;

		MyPanel(Image image) {
			this.setBackground(Color.white);
			this.image = image;
			repaint();
		}

		public void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}
}