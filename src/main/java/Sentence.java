import java.util.LinkedList;
import java.util.List;

public class Sentence extends BaseWord {

    private List<Word> listOfWords;

    public List<Word> getSentence() {
        return listOfWords;
    }

    public Sentence(String text) {
        super(text);
        String[] words = (text + " ").split("\\p{P}?[ \\t\\n\\r]+"); // regular expressions
        createListFromArrayOfWords(words);
    }

    private void createListFromArrayOfWords(String[] words) {
        listOfWords = new LinkedList<Word>();
        for (String word : words) {
            listOfWords.add(new Word(word));
        }
    }


}




