package dk.easv.bll;

import dk.easv.dall.WordsData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordsLogic {
    private WordsData wordsData = new WordsData();

    public List<String> getWords() {
        return wordsData.getWords();
    }

    public List<String> searchWords(String query) {
        List<String> allWords = wordsData.getWords();
        if (allWords == null || query == null || query.trim().isEmpty()) {
            return allWords;
        }

        String lowerCaseQuery = query.toLowerCase();

        return allWords.stream()
                .filter(word -> word.toLowerCase().contains(lowerCaseQuery))
                .collect(Collectors.toList());
    }
}