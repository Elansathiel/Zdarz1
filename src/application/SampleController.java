package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class SampleController {

	@FXML Label etykietka;
	@FXML Button przycisk;
	@FXML public void klik(ActionEvent event) {
		// przycisk.setOnAction((e)->{}); //przyjmuje i oddaje jeden argument
		 //przycisk.setOnAction(this::klikneli); //te¿ drd, pojedynczy argument
		etykietka.setText("Jestem cz³owiekiem");
		
		etykietka.setText("Ju¿ za pózno");

	
	}
}
