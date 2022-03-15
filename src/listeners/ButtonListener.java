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
				this.getInput();
				this.controller.getModel().addition();
				break;
			}
			case "subtraction": {
				this.getInput();
				this.controller.getModel().subtraction();
				break;
			}
			case "multiply": {
				this.getInput();
				this.controller.getModel().multiply();
				break;
			}
			case "divide": {
				this.getInput();
				this.controller.getModel().divide();
				break;
			}
// Das Ergebnis wird in Eingabefeld 1 übertragen:
			case "result": {
				this.controller.getView().getTfInput().setText(this.controller.getView().getLbOutput().getText());
				this.controller.getView().getTfInput2().setText("");
//				this.controller.getModel().setNumberA(Double.parseDouble(this.controller.getView().getLbOutput().getText()));	//Übertrag im Model
//				this.controller.getModel().setNumberB(0);
				break;
			}

			case "back": {
				this.controller.getView().getTfInput2().setText("");
				break;
			}
			
			case "clear": {
				this.controller.getView().getTfInput().setText("");
				this.controller.getView().getTfInput2().setText("");
				this.controller.getView().getLbOutput().setText("0");
				break;
			}
	
			default: {
				throw new RuntimeException("ActionCommand unknown");
			}
		}
	}
	
// Eingabe aus TfInput (Klasse View) wird geholt, in einen double umgewandelt (von String) und in NumberA der Klasse Model gespeichert:
	public void getInput() {
		this.controller.getModel().setNumberA(Double.parseDouble(this.controller.getView().getTfInput().getText()));
		this.controller.getModel().setNumberB(Double.parseDouble(this.controller.getView().getTfInput2().getText()));
	}
}
