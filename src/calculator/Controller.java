package calculator;

public class Controller {
	private Model model;
	private View view;
	
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
	
// Konstruktor
	public Controller(Model model, View view) {
		this.setModel(model);
		this.setView(view);
	}
	
	
}
