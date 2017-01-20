class Word extends BaseWord {

    public Word(String text) {
        super(text);
    }

    public String getWordWithModifiedChar(int index, char symbol) {

        if (index < 0 || index >= this.getOriginalText().length()) {
            return this.getOriginalText();
        }

        char[] chars = this.getOriginalText().toCharArray();
        chars[index] = symbol;

        return String.valueOf(chars);
    }
}

