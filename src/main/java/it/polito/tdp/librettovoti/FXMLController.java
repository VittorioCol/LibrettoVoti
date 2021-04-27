package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	//LinkedList<Libretto> libretti=new LinkedList<Libretto>();
	Libretto libretto=new Libretto();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cerca;

    @FXML
    private TextField nome_esame;

    @FXML
    private TextField voto;

    @FXML
    private TextField data;

    @FXML
    private Button inserisci;
    
    @FXML
    private TextArea Areab;
    
    @FXML
    void doCerca(ActionEvent event) {
    	
    	
    	String ne=nome_esame.getText();
    	if(ne.length()==0) {
    		Areab.setText("Errore: nome esame nullo");
    		return;
    	}
    	
    	
    	int v=0;
    	try{
    		v=Integer.parseInt(voto.getText());
    	}catch(NumberFormatException ex) {
    		Areab.setText("Errore: il voto dev' essere numerico");
    		return;
    	}
    	if(v<18 ||v>39) {
    		Areab.setText("Errore: il voto dev' essere numerico");
    		return;
    	}
    	
    	
    	String dat=data.getText();
    	LocalDate d;
    	try {
    		d=LocalDate.parse(dat);
    	} catch(DateTimeParseException ex) {
    		Areab.setText("Errore: data non è nel formato corretto");
    		return;
    	}
    	
    	
    	libretto.add(new Voto(ne, v, d));
    	
    	
    	nome_esame.clear();
    	voto.clear();
    	data.clear();
    }

    @FXML
    void doInserisci(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cerca != null : "fx:id=\"cerca\" was not injected: check your FXML file 'Scene.fxml'.";
        assert nome_esame != null : "fx:id=\"nome_esame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert voto != null : "fx:id=\"voto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert data != null : "fx:id=\"data\" was not injected: check your FXML file 'Scene.fxml'.";
        assert inserisci != null : "fx:id=\"inserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Areab != null : "fx:id=\"Areab\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
