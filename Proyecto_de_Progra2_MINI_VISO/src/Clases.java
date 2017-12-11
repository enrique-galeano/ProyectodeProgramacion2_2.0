
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Clases {
	private ArrayList<JLabel> label = new ArrayList();
	private JPanel panel;

	public Clases() {
	}

	public Clases(JPanel panel) {
		this.panel = panel;
	}

	public ArrayList<JLabel> getLabel() {
		return label;
	}

	public void setLabel(ArrayList<JLabel> label) {
		this.label = label;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public String toString() {
		return "Clases{" + '}';
	}
	
	
}
