package model;

import javafx.beans.property.*;

public class Fach {
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
	
	public Fach(String bezeichnung, int wertung) {
		bezeichnung().set(bezeichnung);
		wertung().set(wertung);
	}
}
