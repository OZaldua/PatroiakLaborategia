package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		Covid19Pacient p = (Covid19Pacient) o;
		int farenheit =	(int)	p.covidImpact();	

		if (farenheit<5) {
			getContentPane().setBackground(Color.green);
			repaint();
		} else if (farenheit>=5 && farenheit<10) {
			getContentPane().setBackground(Color.yellow);
			repaint();			
		} else {
			getContentPane().setBackground(Color.red);
			repaint();			
		}		
	}
}     

