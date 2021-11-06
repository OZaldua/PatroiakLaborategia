package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import domain.Symptom;

public class Covid19PacientIteratorAdapter implements InvertedIterator {
 
	private final List<Symptom> symptoms;
	private int position;

	public Covid19PacientIteratorAdapter(Set<Symptom> ss) {
		symptoms = new ArrayList<>(ss);
		position = ss.size()-1;
	}
	
	// return the actual element and go to the previous
	public Object previous() {
		Symptom sy = symptoms.get(position);
		position--;
		return (Object) sy;
	}

	// true if there is a previous element
	public boolean hasPrevious() {
		if (position>=0) return true;
		else return false;
	}

	// It is placed in the last element
	public void goLast() {
		position = symptoms.size()-1;
	}
	
}
