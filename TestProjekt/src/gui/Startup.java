package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Startup {

	private JFrame _anzeige;

	public Startup() {
		_anzeige = new JFrame();
		_anzeige.getContentPane().add(testSteckbrief());
		_anzeige.setVisible(true);
		_anzeige.pack();
		
	}

	private JPanel testSteckbrief() {
		Charakter benni = new Charakter();
		benni.set_alter("21");
		benni.set_augenfarbe("braun");
		benni.set_beruf("Student");
		benni.set_beschreibung("Der Benni sieht total gut aus, und beobachtet sich f�r gew�hnlich selbst gerne in Spiegeln. Deswegen stehen in seinem Zimmer auch 20 Spiegel an jeder Seite. Kann ich verstehen.");
		benni.set_beziehungen(null);
		benni.set_bild("bildplatzhalter.jpg");
		benni.set_eigenschaften("Der Benni ist sehr hilfsbereit und kann total gut programmieren. Er kann au�erdem toll singen. Und ich glaube er kann noch viele weitere Dinge die ich noch nicht gesehen habe, aber das werde ich noch herausfinden! Er kann wie ein Dinosaurier schreien und auch wie ein Vogel. Er sammelt M�NNLICHE FILME. Und er spielt M�NNLICHE SPIELE.");
		benni.set_familie(null);
		benni.set_sternzeichen("Skorpion");
		benni.set_groesse("2,50");
		benni.set_haarfarbe("Blau");
		benni.set_nachname("von Wollmer");
		benni.set_name("DER Benni");
		benni.set_story("Eines Tages wurde Benni gefragt, ob er coole Smileys kennt. Daraufhin fragte er 'Wat' und war dennoch sehr hilfsbereit. Dann ging er weg, und kramte hinter seinem Sofa nach Dingen. Man h�rte es knistern. Und dann fragte er mich, ob ich an meinen Nulltagen nur Wasser trinke, woraufhin ich genickt habe. Und er bot mir an, dass ich dennoch andere Dinge trinken k�nnte wenn ich es wollte. Das war sehr nett von ihm. Er glaubte, dass das Flugzeug abst�rzt, deswegen sah er aus dem Fenster, aber er sah nichts. W�hrrenddessen trank er gen�sslich seine Cola und stellte fest, dass seine Nachbarn was kochten. Er nahm sich eine sehr m�nnliche Hantel und stellte sich vor den Spiegel.");
		ArrayList <String>liste = new ArrayList<String>();
		liste.add("#yolo");
		liste.add("#swag");
		liste.add("#gangser");
		liste.add("#thug live");
		liste.add("#money");
		liste.add("#$$$");
		benni.set_tags(liste);
		Steckbrief benniSteckbrief = new Steckbrief(benni);
		return benniSteckbrief.getSteckbriefPanel();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Startup();

	}

}
