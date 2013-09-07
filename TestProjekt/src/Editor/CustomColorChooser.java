package Editor;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustomColorChooser {
	Color farbe;

	public CustomColorChooser() {
		final Color dieFarbe;
		JPanel color1 = new JPanel();
		JPanel color2 = new JPanel();
		JPanel color3 = new JPanel();
		JPanel color4 = new JPanel();
		JPanel color5 = new JPanel();
		JPanel color6 = new JPanel();

		color1.setBackground(Color.green);
		color2.setBackground(Color.blue);
		color3.setBackground(Color.yellow);
		color4.setBackground(Color.blue);
		color5.setBackground(Color.red);
		color6.setBackground(Color.orange);

		JPanel[] farben = { color1, color2, color3, color4, color5, color6 };

		for (final JPanel p : farben) {
			p.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					setColor(p.getBackground());

				}
			});
		}

		JOptionPane pane = new JOptionPane(farben, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

		pane.createDialog(null, "Bitte wählen Sie eine Größe").setVisible(true);

		System.out.println(farbe.toString());

	}

	public void setColor(Color f) {
		farbe = f;
	}
	
	public static void main(String[] args){
		new CustomColorChooser();
	}

}
