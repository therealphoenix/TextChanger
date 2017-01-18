import java.util.LinkedList;
import java.util.List;

public class Sentence extends BaseWord{

    private List<Word> listOfWords;

    public List<Word> getSentence() {
        return listOfWords;
    }

    public Sentence (String text) {
        super(text);
        String[] words = (text + " ").split("\\p{P}?[ \\t\\n\\r]+"); // regular expressions
        createListFromArrayOfWords(words);
    }

    private void createListFromArrayOfWords(String [] words) {
        listOfWords = new LinkedList<Word>();
        for (String word : words) {
            listOfWords.add(new Word(word));
        }
    }

        public String getWordWithModifiedChar(Word word, int index, char symbol) {
            if(word == null){
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




