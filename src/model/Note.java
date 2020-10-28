package model;

import javafx.beans.property.*;

public class Note {
	private StringProperty bezeichnung, kommentar;
	private IntegerProperty wertung;
	private FloatProperty note;
	
	public StringProperty bezeichnung() {
		if(bezeichnung == null) {
			bezeichnung = new SimpleStringProperty();
		}
		return bezeichnung;
	}
	
	public StringProperty kommentar() {
		if(kommentar == null) {
			kommentar = new SimpleStringProperty();
		}
		return kommentar;
}
	
	public IntegerProperty wertung() {
		if(wertung == null) {
			wertung = new SimpleIntegerProperty();
		}
		return wertung;
	}
	
	public FloatProperty note() {
		if(note == null) {
			note = new SimpleFloatProperty();
		}
		return note;
	}
	
	public Note(String bezeichnung, String kommentar, int wertung, float note) {
		bezeichnung().set(bezeichnung);
		kommentar().set(kommentar);
		wertung().set(wertung);
		note().set(note);
	}
	
	public Note() {
		
	}
}