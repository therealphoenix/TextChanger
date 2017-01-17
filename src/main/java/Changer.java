import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hp on 17.01.2017.
 */
public class Changer {

    public Sentence change(Sentence sentence, int position, char letter) {

        String[] words = (sentence.getText() + " ").split("\\p{P}?[ \\t\\n\\r]+");
       // System.out.println(Arrays.toString(words));

        List<Word> listOfwords = new LinkedList<Word>();

        for(String part : words ){
             Word word = new Word(part);
             word.setText(part);
             listOfwords.add(word);

        }

        StringBuilder result = new StringBuilder();

        for (Word word : listOfwords) {
            result.append(replace(word.getText(),position,letter) + " ");

        }
            sentence.setText(new String(result));
        return sentence;
    }
    
        public String replace(String str, int index, char replace){
            if( str == null ){
                return str;
            }
            else if(index < 0 || index >= str.length()){
                return str;
            }
            char[] chars = str.toCharArray();
            chars[index] = replace;

            return String.valueOf(chars);
        }


    }

