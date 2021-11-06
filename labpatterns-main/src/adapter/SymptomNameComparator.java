package adapter;

import domain.Symptom;

public class SymptomNameComparator implements java.util.Comparator{
	
	private Symptom s1, s2;
	
	public int compare(Object o1, Object o2) {
		this.s1 = (Symptom)o1;
		this.s2 = (Symptom)o2;
		return s1.getName().compareTo(s2.getName());
	}
	
}
