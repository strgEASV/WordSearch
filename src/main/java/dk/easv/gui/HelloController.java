package dk.easv.gui;

import dk.easv.bll.WordsLogic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{
    @FXML
    private ListView lstWords;

    private WordsLogic wordsLogic = new WordsLogic();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> wordsList = wordsLogic.getWords();
        for(String w : wordsList)
        {
            lstWords.getItems().add(w);
        }
    }
}
