package controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.Schule;
import javafx.event.ActionEvent;

public class SchuleEditViewController {
	@FXML
	private Button btnSpeichern;
	@FXML
	private Button btnAbbrechen;
	@FXML
	private TextField txtSchule;
	
	private Schule s = new Schule();
	private boolean speichernClicked;

	// Event Listener on Button[#btnSpeichern].onAction
	@FXML
	public void btnSpeichernClicked(ActionEvent event) {
		s.bezeichnung().set(txtSchule.getText());
	}
	// Event Listener on Button[#btnAbbrechen].onAction
	@FXML
	public void btnAbbrechenClicked(ActionEvent event) {
		Window window = txtSchule.getScene().getWindow();
		((Stage)window).close();
	}
}
