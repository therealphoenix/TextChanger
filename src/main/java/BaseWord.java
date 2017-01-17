/**
 * Created by Hp on 17.01.2017.
 */
public class BaseWord {

        protected String originalText;

        BaseWord (String text) {
            this.originalText = text;
        }

        protected  String getOriginalText() { // только наследники будут иметь доступ к нему!!!
            return originalText;
        }
    }


