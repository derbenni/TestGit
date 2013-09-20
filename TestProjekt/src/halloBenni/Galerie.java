package halloBenni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Galerie {

	private ArrayList<ImageIcon> _bilder;
	JScrollPane _scrollPane;
	JPanel _content;

	public Galerie(String pfad) {
		_content = new JPanel();
		_content.setBackground(Color.white);
		_bilder = new ArrayList<ImageIcon>();

		BoxLayout box = new BoxLayout(_content, 1);
		
		_content.setLayout(box);
		ladeBilderAusOrdner(pfad);
		for (ImageIcon i:_bilder){
			JLabel l = new JLabel();
			l.setIcon(i);
			_content.add(l);
		}
		
		_scrollPane = new JScrollPane();
		
//		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		_scrollPane.getViewport().add(_content);
	}
	
	private void updateMaxSize(){
		_content.setMaximumSize(_scrollPane.getParent().getSize());
	}
	
	public JScrollPane getGaleriePanel(){
		return _scrollPane;
	}

	public void ladeBilderAusOrdner(String pfad) {
		File ordner = new File(pfad);

		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if ((name.contains(".png")) || (name.contains(".jpg"))) {
					return true;
				}

				return false;
			}
		};
		File[] dateien = ordner.listFiles(filter);

		for (File f : dateien) {
			ImageIcon bild = new ImageIcon(f.getPath());
				_bilder.add(bild);
			System.out.println(f.getPath());
			

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Galerie g = new Galerie("BeispielBilder/");
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().setPreferredSize(new Dimension(500,500));
		frame.getContentPane().add(g.getGaleriePanel(), BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.pack();

	}

}
