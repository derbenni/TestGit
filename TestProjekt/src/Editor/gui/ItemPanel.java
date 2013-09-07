package Editor.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2129400054394396438L;

	public static enum ItemIcon {
		SCHLUESSEL, TRANK, WOLLKNAEUL, KAESE, PFLANZE, KATZE, MAUS, TELEPORTER
	}

	public ItemPanel(ItemIcon icon, Color farbe) {
		this.setBackground(Color.white);
		JPanel contentPanel = new JPanel(new BorderLayout());
		this.add(contentPanel);
		String dateiname = "";
		switch (icon) {
		case SCHLUESSEL:
			dateiname = "schluessel";
			break;
		case TRANK:
			dateiname = "potion";
			break;
		case WOLLKNAEUL:
			dateiname = "wollknaeul";
			break;
		case KAESE:
			dateiname = "kaese";
			break;
		case PFLANZE:
			dateiname = "pflanze";
			break;
		case KATZE:
			dateiname = "katze";
			break;
		case MAUS:
			dateiname = "maus";
			break;
		case TELEPORTER:
			dateiname = "teleporter";
		}
		dateiname = "icons\\klein_" + dateiname + ".gif";
		ImageIcon bild = new ImageIcon(dateiname);
		JLabel bildhalter = new JLabel(bild);
		contentPanel.setBackground(farbe);
		contentPanel.setMaximumSize(new Dimension(bild.getIconWidth(), bild.getIconHeight()));
		contentPanel.setPreferredSize(new Dimension(bild.getIconWidth(), bild.getIconHeight()));
		contentPanel.add(bildhalter, BorderLayout.CENTER);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new ItemPanel(ItemIcon.TRANK, Color.red));
		frame.setVisible(true);
		frame.pack();
	}

}
