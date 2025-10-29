package dk.easv.gui;

import dk.easv.bll.WordsLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView<String> lstWords;
    @FXML
    private TextField searchInput;

    private WordsLogic wordsLogic = new WordsLogic();
    private List<String> allWords;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        allWords = wordsLogic.getWords();
        if (allWords != null) {
            lstWords.getItems().setAll(allWords);
        }
    }

    @FXML
    private void handleSearch(ActionEvent event) {
        String query = searchInput.getText().toLowerCase();
        if (query.isEmpty()) {
            lstWords.getItems().setAll(allWords);
        } else {
            List<String> filteredWords = wordsLogic.searchWords(query);
            lstWords.getItems().setAll(filteredWords);
        }
    }
}