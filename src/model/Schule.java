package model;

import javafx.beans.property.*;

public class Schule {
	private StringProperty bezeichnung;
	private FloatProperty schnitt;
	
	public StringProperty bezeichnung() {
		if(bezeichnung == null) {
			bezeichnung = new SimpleStringProperty();
		}
		return bezeichnung;
	}
	
	public FloatProperty schnitt() {
		if(schnitt == null) {
			schnitt = new SimpleFloatProperty();
		}
		return schnitt;
	}
	
	public Schule(String bezeichnung) {
		bezeichnung().set(bezeichnung);
	}
}


