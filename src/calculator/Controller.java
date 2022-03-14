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
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("addition")
				) 
				{
//				this.getModel().setNumberA(Double.parseDouble(this.getView().getTfInput().getText()));
				System.out.println("TfInput: " + Double.parseDouble(this.getView().getTfInput().getText()));
			
				System.out.println(" --- ");
		
				this.getView().getLbOutput().setText(
						String.valueOf(evt.getNewValue())	//wird im Label LbOutput angezeigt
						);
				}
	}

	
}
