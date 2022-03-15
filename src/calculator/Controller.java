package calculator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import listeners.ButtonListener;

public class Controller implements PropertyChangeListener {
	private Model model;
	private View view;
	private ButtonListener buttonListener;
	
//getter setter
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}

	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}
	public ButtonListener getButtonListener() {
		return buttonListener;
	}
	public void setButtonListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}
	
// Konstruktor
	public Controller(Model model, View view) {
		this.setModel(model);
		this.setView(view);
		
		this.setButtonListener(new ButtonListener(this));
		this.getModel().addPropertyChangeListeners(this);
		
//addition
		this.getView().getBtnAdd().setActionCommand("addition");
		this.getView().getBtnAdd().addActionListener(this.getButtonListener());
//subtraction
		this.getView().getBtnSubtract().setActionCommand("subtraction");
		this.getView().getBtnSubtract().addActionListener(this.getButtonListener());
//multiply
		this.getView().getBtnMultiply().setActionCommand("multiply");
		this.getView().getBtnMultiply().addActionListener(this.getButtonListener());
//divide
		this.getView().getBtnDivide().setActionCommand("divide");
		this.getView().getBtnDivide().addActionListener(this.getButtonListener());
//result	
		this.getView().getBtnResult().setActionCommand("result");
		this.getView().getBtnResult().addActionListener(this.getButtonListener());
//back	
		this.getView().getBtnBack().setActionCommand("back");
		this.getView().getBtnBack().addActionListener(this.getButtonListener());
//clear	
		this.getView().getBtnClear().setActionCommand("clear");
		this.getView().getBtnClear().addActionListener(this.getButtonListener());
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("addition") ||
			evt.getPropertyName().equals("subtraction") ||
		   	evt.getPropertyName().equals("multiply") ||
		   	evt.getPropertyName().equals("divide") ||
			evt.getPropertyName().equals("result") ||
			evt.getPropertyName().equals("back") ||
			evt.getPropertyName().equals("clear") )
				{
				System.out.println(" --- ");
				System.out.println("TfInput: " + Double.parseDouble(this.getView().getTfInput().getText()));	//nur zur Übersicht, keine Funktion
				this.getView().getLbOutput().setText(
						String.valueOf(evt.getNewValue())	//NewValue wird im Label LbOutput angezeigt
						);
				}
	}

	
}
