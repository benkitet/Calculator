package calculator;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
	private double numberA;
	private double numberB;
	private double result;
	private PropertyChangeSupport propertyChangeSupport;

//getter setter
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public double getResult() {
		return result;
	}	
	public void setResult(double result) {
		this.result = result;
	}
	public PropertyChangeSupport getPropertyChangeSupport() {
		return propertyChangeSupport;
	}
	public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
		this.propertyChangeSupport = propertyChangeSupport;
	}
//Konstruktor
	public Model() {
		this(0, 0);
	}
	
//	public Model(double result) {
//		this.setResult(result);
//		this.setPropertyChangeSupport(new PropertyChangeSupport(this));
//	}
	
	public Model(double result, double numberA) {
		this.setResult(result);
		this.setNumberA(numberA);
		this.setPropertyChangeSupport(new PropertyChangeSupport(this));
	}
//Methoden
	public void addPropertyChangeListeners(PropertyChangeListener pcl) {
		this.getPropertyChangeSupport().addPropertyChangeListener(pcl);
	}
	public void removePropertyChangeListeners(PropertyChangeListener pcl) {
		this.getPropertyChangeSupport().removePropertyChangeListener(pcl);
	}
	
	

	public void addition() {
		double newValue = this.getNumberA() + this.getNumberB();
		this.getPropertyChangeSupport().firePropertyChange("addition", this.getNumberA(), newValue);
		this.setResult(newValue);
		System.out.println("Ergebnis der Addition ist: \n Result: " + getResult() + "\n newValue: " + newValue + "\n numberA " + getNumberA() + "\n numberB " + getNumberB());
	}

	public void subtraction() {
		double newValue = this.getNumberA() - this.getNumberB();
		this.getPropertyChangeSupport().firePropertyChange("subtraction", this.getNumberA(), newValue);
		this.setResult(newValue);
		System.out.println("Ergebnis der Subtraktion ist: \n Result: " + getResult() + "\n newValue: " + newValue + "\n numberA " + getNumberA() + "\n numberB " + getNumberB());
	}
	
	public void multiply() {
		double newValue = this.getNumberA() * this.getNumberB();
		this.getPropertyChangeSupport().firePropertyChange("multiply", this.getNumberA(), newValue);
		this.setResult(newValue);
		System.out.println("Ergebnis der Multiplikation ist: \n Result: " + getResult() + "\n newValue: " + newValue + "\n numberA " + getNumberA() + "\n numberB " + getNumberB());
	}
	
	public void divide() {
		double newValue = this.getNumberA() / this.getNumberB();
		this.getPropertyChangeSupport().firePropertyChange("multiply", this.getNumberA(), newValue);
		this.setResult(newValue);
		System.out.println("Ergebnis der Multiplikation ist: \n Result: " + getResult() + "\n newValue: " + newValue + "\n numberA " + getNumberA() + "\n numberB " + getNumberB());
	}

}
