import java.util.LinkedList;
import java.util.List;

public class Sentence extends BaseWord {

    private List<Word> listOfWords;

    public List<Word> getSentence() {
        return listOfWords;
    }

    public Sentence(String text) {
        super(text);
        this.listOfWords = new LinkedList<Word>();
        String[] words = (text + " ").split("\\p{P}?[ \\t\\n\\r]+"); // regular expressions
        fillListFromArrayOfWords(words);
    }

    private void fillListFromArrayOfWords(String[] words) {

        for (String word : words) {
            listOfWords.add(new Word(word));
        }
    }


}




