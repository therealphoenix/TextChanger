public class BaseWord {

    protected String originalText;

    BaseWord(String text) {
        this.originalText = text;
    }

    protected String getOriginalText() {  //  only inherited classes have access
        return originalText;
    }
}


