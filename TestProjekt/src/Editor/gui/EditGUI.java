package Editor.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

public class EditGUI {
	JFrame _frame;

	// ArrayList<JPanel> _moeglicheRaeume;
	// ArrayList<RaumPanel> _tatsaechlicheRaeume;

	public EditGUI(int spalte, int zeile) {
		// _tatsaechlicheRaeume = new ArrayList<RaumPanel>();
		// _moeglicheRaeume = new ArrayList<JPanel>();
		_frame = new JFrame("Editor");
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.getContentPane().setLayout(new BorderLayout());
		GridLayout grid = new GridLayout(spalte, zeile);
		_frame.getContentPane().setLayout(grid);
		int anzahl = spalte * zeile;
		raumhalterInitialisieren(anzahl);

		_frame.setVisible(true);
		_frame.pack();
	}

	private void raumhalterInitialisieren(int anzahl) {
		for (int i = 0; i < anzahl; ++i) {
			final JPanel panel = new JPanel(new BorderLayout());
			panel.setName(i + "");
			panel.setPreferredSize(new Dimension(150, 150));
			panel.setBorder(new LineBorder(Color.black));
			panel.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent arg0) {
					if (SwingUtilities.isLeftMouseButton(arg0)) {
						RaumPanel raum = new RaumPanel(3, 3);
						panel.add(raum, BorderLayout.CENTER);
						// _tatsaechlicheRaeume.add(raum);
						String name = JOptionPane.showInputDialog("Wie soll der Raum heißen?");
						System.out.println(name);
						raum.setName(name);
						panel.repaint();
						panel.validate();
						// _frame.pack();
					} else if (SwingUtilities.isRightMouseButton(arg0)) {
						// _tatsaechlicheRaeume.remove(Integer.parseInt(panel.getName()));
						panel.removeAll();
						panel.repaint();
						panel.validate();
					}

				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}
			});
			_frame.getContentPane().add(panel);
		}
	}

	public static void main(String[] args) {
		new EditGUI(4, 4);
	}

}
