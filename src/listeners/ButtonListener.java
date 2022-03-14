package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculator.Controller;

public class ButtonListener implements ActionListener{
	private Controller controller;
	
	public ButtonListener(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "addition": {
//				controller.getView().getTfInput().getText();
// Eingabe aus TfInput (Klasse View) wird geholt, in einen double umgewandelt (von String) und in NumberA der Klasse Model gespeichert:
				this.controller.getModel().setNumberA(Double.parseDouble(this.controller.getView().getTfInput().getText()));
				controller.getModel().addition();
				break;
			}
			case "subtraction": {
				controller.getModel().subtraction();
				break;
			}
	// noch einf�gen: multiply, division, back, clear
			
			default: {
				throw new RuntimeException("ActionCommand unknown");
			}
		}
	}
	
}
