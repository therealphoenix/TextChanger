import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text please: ");
        String text = sc.nextLine();

        System.out.println("Input position please:");
        int position = sc.nextInt();

        System.out.println("Input symbol please:");
        char symbol = sc.next().trim().charAt(0);
        sc.close();

        Sentence sentence = new Sentence(text);
        System.out.print("Sentence before change: " + sentence.getOriginalText() );
        System.out.println();
        System.out.print("Sentence after change: " );

        StringBuilder builder = new StringBuilder();
        String space = " ";

          for(Word word : sentence.getSentence()){
            builder.append(word.getWordWithModifiedChar(position, symbol));
            builder.append(space);
        }
        System.out.println(builder.toString());



    }

}
