package halloBenni;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwitchFeld {
	private JLabel _label;
	private JTextField _field;
	private boolean _editMode;
	

	public SwitchFeld() {
		_label = new JLabel();
		_field = new JTextField();
		_editMode = false;
	}

	public Object getFeld() {
		if (_editMode) {
			return _field;
		} else {
			return _label;
		}

	}
	
	public void setText(String tex){
		_label.setText(tex);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
