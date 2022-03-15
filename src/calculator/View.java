package calculator;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class View extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JLabel lbInput;
	private JTextField tfInput;
	private JLabel lbInput2;
	private JTextField tfInput2;
	private JLabel lbResult;
	private JLabel lbOutput;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btnAdd;
	private JButton btnSubtract;
	private JButton btnResult;
	private JButton btnBack;
	private JButton btnClear;
//getter setter
	public JLabel getLbInput() {
		return lbInput;
	}
	public void setLbInput(JLabel lbInput) {
		this.lbInput = lbInput;
	}
	public JTextField getTfInput() {
		return tfInput;
	}
	public void setTfInput(JTextField tfInput) {
		this.tfInput = tfInput;
	}
	public JLabel getLbInput2() {
		return lbInput2;
	}
	public void setLbInput2(JLabel lbInput2) {
		this.lbInput2 = lbInput2;
	}
	public JTextField getTfInput2() {
		return tfInput2;
	}
	public void setTfInput2(JTextField tfInput2) {
		this.tfInput2 = tfInput2;
	}
	public JLabel getLbResult() {
		return lbResult;
	}
	public void setLbResult(JLabel lbResult) {
		this.lbResult = lbResult;
	}
	public JLabel getLbOutput() {
		return lbOutput;
	}
	public void setLbOutput(JLabel lbOutput) {
		this.lbOutput = lbOutput;
	}
	public JButton getBtnDivide() {
		return btnDivide;
	}
	public void setBtnDivide(JButton btnDivide) {
		this.btnDivide = btnDivide;
	}
	public JButton getBtnMultiply() {
		return btnMultiply;
	}
	public void setBtnMultiply(JButton btnMultiply) {
		this.btnMultiply = btnMultiply;
	}
	public JButton getBtnAdd() {
		return btnAdd;
	}
	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
	public JButton getBtnSubtract() {
		return btnSubtract;
	}
	public void setBtnSubtract(JButton btnSubtract) {
		this.btnSubtract = btnSubtract;
	}
	public JButton getBtnResult() {
		return btnResult;
	}
	public void setBtnResult(JButton btnResult) {
		this.btnResult = btnResult;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	public JButton getBtnClear() {
		return btnClear;
	}
	public void setBtnClear(JButton btnClear) {
		this.btnClear = btnClear;
	}
//Konstruktor
	public View() {
		super.setTitle("Calculator");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(new Dimension(250,200));
		super.setLocationRelativeTo(null);
		
		super.setLayout(new FlowLayout());
//Label und Textfelder
		this.setLbInput(new JLabel("Input 1"));
		this.setLbInput2(new JLabel("Input 2"));
		this.setTfInput(new JTextField());
		this.getTfInput().setPreferredSize(new Dimension(160, 25));
		this.getTfInput().setHorizontalAlignment(JLabel.RIGHT);
		this.setTfInput2(new JTextField());
		this.getTfInput2().setPreferredSize(new Dimension(160, 25));
		this.getTfInput2().setHorizontalAlignment(JLabel.RIGHT);
		this.setLbResult(new JLabel("Result"));
		this.setLbOutput(new JLabel("0"));
		this.getLbOutput().setPreferredSize(new Dimension(160, 25));		//lbOutput wird erst gegettet und dann mit der PreferredSize gesettet, mit Punktnotation
		this.getLbOutput().setHorizontalAlignment(JLabel.RIGHT);
//Buttons
		this.setBtnDivide(new JButton("/"));
		this.setBtnMultiply(new JButton("x"));
		this.setBtnSubtract(new JButton("-"));
		this.setBtnAdd(new JButton("+"));
		this.setBtnResult(new JButton("="));
		this.setBtnBack(new JButton("back"));
		this.setBtnClear(new JButton("clear"));
//Elemente hinzufügen		
		super.add(this.getLbInput());
		super.add(this.getTfInput());
		super.add(this.getLbInput2());
		super.add(this.getTfInput2());
		super.add(this.getLbResult());
		super.add(this.getLbOutput());
		super.add(this.getBtnDivide());
		super.add(this.getBtnMultiply());
		super.add(this.getBtnSubtract());
		super.add(this.getBtnAdd());
		super.add(this.getBtnResult());
		super.add(this.getBtnBack());
		super.add(this.getBtnClear());
				
		super.setVisible(true);
	}
}
