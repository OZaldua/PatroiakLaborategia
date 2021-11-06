package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		
		Covid19Pacient p = new Covid19Pacient("Aitor", 35);
		p.addSymptomByName("tos seca", 3);
		p.addSymptomByName("dolor de garganta", 3);
		p.addSymptomByName("escalofrios", 1);
		p.addSymptomByName("nauseas", 2);
		p.addSymptomByName("fiebre", 1);
		p.addSymptomByName("disnea", 2);
		p.addSymptomByName("diarrea", 1);

		Sorting sorting = new Sorting();
		Covid19PacientIteratorAdapter cpi = new Covid19PacientIteratorAdapter(p.getSymptoms());
		InvertedIterator adapter = cpi;
		
		//Sintomak izenaren arabera ordenatuta pantailaratu.
		System.out.println(p.getName() + "-(r)en sintomak izenaren arabera ordenaturik:");
		Iterator<Object> s = sorting.sortedIterator(adapter, new SymptomNameComparator());
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		
		System.out.println();
		
		//Sintomak larritasunaren arabera ordenatuta pantailaratu.
		System.out.println(p.getName() + "-(r)en sintomak haien larritasunaren arabera ordenaturik:");
		Iterator<Object> s2 = sorting.sortedIterator(adapter, new SeverityIndexComparator());
		while (s2.hasNext()) {
			Symptom sym = (Symptom) s2.next();
			System.out.println(sym.getName() + " " + sym.getSeverityIndex());
		}
	}

}
