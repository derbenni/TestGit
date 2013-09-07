package Editor;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
	JLabel _label;

	public Panel() {
		_label = new JLabel();
		String pfad = "C:\\Users\\benny_000\\Dropbox\\Der tolle Ordner\\SEP\\grafiken\\Potion3.gif";
		ImageIcon bild = new ImageIcon(pfad);
		_label.setIcon(bild);
		_label.setOpaque(false);
		_label.setBackground(Color.green);
		
		
		
		this.add(_label);
		Color farbe = JColorChooser.showDialog(null, "Wählen Sie eine Farbe", null);
		this.setBackground(farbe);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.red);
		frame.add(new Panel());
		frame.setVisible(true);
		frame.pack();
	}

}
