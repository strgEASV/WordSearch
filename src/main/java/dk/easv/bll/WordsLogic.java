package dk.easv.bll;

import dk.easv.dall.WordsData;

import java.util.List;

public class WordsLogic
{
    private WordsData wordsData = new WordsData();
    public List<String> getWords()
    {
        return wordsData.getWords();
    }
}
