package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		//Hiru paziente sortu
		Observable pacient=new Covid19Pacient("Aitor", 35);
		Observable pacient2=new Covid19Pacient("Oihane", 19);
		Observable pacient3=new Covid19Pacient("Jose", 60);
		
		//Paziente bakoitzeko Observer bat
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		
		//Paziente bakoitzeko sintomak gehitzeko edo kentzeko interfazea sortu
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		PacientSymptomGUI frame2 = new PacientSymptomGUI ((Covid19Pacient) pacient2);
		PacientSymptomGUI frame3 = new PacientSymptomGUI ((Covid19Pacient) pacient3);
		
		//Paziente bakoitzeko termometro bat sortu
		PacientThermometerGUI th = new PacientThermometerGUI((Covid19Pacient) pacient);
		PacientThermometerGUI th2 = new PacientThermometerGUI((Covid19Pacient) pacient2);
		PacientThermometerGUI th3 = new PacientThermometerGUI((Covid19Pacient) pacient3);
		
		//Paziente bakoitzeko semaforo bat sortu
		SemaphorGUI s = new SemaphorGUI((Covid19Pacient) pacient);
		SemaphorGUI s2 = new SemaphorGUI((Covid19Pacient) pacient2);
		SemaphorGUI s3 = new SemaphorGUI((Covid19Pacient) pacient3);
	}


}
