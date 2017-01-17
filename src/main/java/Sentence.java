import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hp on 17.01.2017.
 */
public class Sentence extends BaseWord{

    private List<Word> sentence;
    private String[] words;


    public List<Word> getSentence() {
        return sentence;
    }

    public Sentence (String text) {
        super(text);
        String[] words = (text + " ").split("\\p{P}?[ \\t\\n\\r]+");

        createListFromWordArray(words);
    }

    private void createListFromWordArray(String [] words) {
        sentence = new LinkedList<Word>();
        for (String word : words) {
            sentence.add(new Word(word));
        }
    }

        public String getWordWithModifiedChar(Word word, int index, char symbol) {
            if( word == null ){
                return null;
            }
            else if(index < 0 || index >= word.getOriginalText().length()) {
                return word.getOriginalText();
            }

            char[] chars = word.getOriginalText().toCharArray();
            chars[index] = symbol;

            return String.valueOf(chars);
    }


}




