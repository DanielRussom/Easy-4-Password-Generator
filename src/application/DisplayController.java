package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class DisplayController {
	@FXML
	private TextField passwordDisplay;
	@FXML
	private CheckBox cbCharLimit;
	@FXML
	private ComboBox<Integer> charLimit;

	@FXML
	private void generateNewPassword() {
		if (cbCharLimit.isSelected()) {
			int limit = charLimit.getValue();
			passwordDisplay.setText(PasswordGenerator.generatePassword(limit));
		} else {
			passwordDisplay.setText(PasswordGenerator.generatePassword());
		}
	}

	@FXML
	private void toggleCharLimit() {
		charLimit.setDisable(!cbCharLimit.isSelected());
	}

	protected void initComboBox() {
		charLimit.getItems().addAll(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		charLimit.getSelectionModel().selectFirst();
	}
}
