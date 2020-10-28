package model;

import javafx.beans.property.*;

public class Semester {
	private StringProperty bezeichnung;
	private IntegerProperty wertung;
	private FloatProperty schnitt;
	
	public StringProperty bezeichnung() {
		if(bezeichnung == null) {
			bezeichnung = new SimpleStringProperty();
		}
		return bezeichnung;
	}
	
	public IntegerProperty wertung() {
		if(wertung == null) {
			wertung = new SimpleIntegerProperty();
		}
		return wertung;
	}
	
	public FloatProperty schnitt() {
		if(schnitt == null) {
			schnitt = new SimpleFloatProperty();
		}
		return schnitt;
	}
	
	public Semester(String bezeichnung, int wertung, float schnitt) {
		bezeichnung().set(bezeichnung);
		wertung().set(wertung);
	}
}
