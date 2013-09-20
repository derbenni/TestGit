package halloBenni;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LayoutTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, 1));

		
		for (int i = 0;i<20;++i){
			content.add(new JLabel("ULUMULU"));
		}
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(content);
		frame.setContentPane(scroll);
		frame.setVisible(true);
		frame.pack();
	}

}
