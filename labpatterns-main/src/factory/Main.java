package factory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, sf);
		new PacientSymptomGUI(p1);

		Medicament m=new Medicament("Ibuprofeno", sf);
		new MedicalGUI(m);
	}

}
