
import com.sun.istack.internal.logging.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class hilohora implements Runnable {

	private JLabel hora;

	public hilohora(JLabel hora) {
		this.hora = hora;
	}

	public hilohora() {
	}

	@Override
	public void run() {
		while (true) {
			Date h = new Date();
			DateFormat f = new SimpleDateFormat("hh:mm:ss");
			hora.setText(f.format(h));
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {

			}
		}
	}

}
