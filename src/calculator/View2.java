package calculator;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class View2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View2() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbInput = new JLabel("Eingabe");
		panel.add(lbInput, BorderLayout.NORTH);
		
		JLabel lbResult = new JLabel("Ergebnis");
		panel.add(lbResult, BorderLayout.SOUTH);

	}

}
