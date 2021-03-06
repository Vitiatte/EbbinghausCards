package sample.controller.training;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import sample.db.entity.Card;
import sample.db.entity.NoteCard;

import java.net.URL;
import java.util.ResourceBundle;

public class FrontSideOfNoteController implements TrainingWindow{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text titleTextField;

    @FXML
    private Text bookTextField;

    @FXML
    public void initialize(Card card) {
        NoteCard noteCard = (NoteCard) card;

        titleTextField.setText(noteCard.getTitle());
        bookTextField.setText(noteCard.getBook());
    }
}
