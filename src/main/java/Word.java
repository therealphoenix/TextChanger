/**
 * Created by Hp on 17.01.2017.
 */
class Word extends BaseWord {
   private String currentText;

    public Word(String text) {
        super(text);
        this.currentText = text;
    }

    public String getWordWithModifiedChar(int index, char symbol) {

         if(index < 0 || index >= this.getOriginalText().length()) {
            return this.getOriginalText();
        }

        char[] chars = this.getOriginalText().toCharArray();
        chars[index] = symbol;

        return String.valueOf(chars);
    }
}

