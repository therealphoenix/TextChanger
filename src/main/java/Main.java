import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by Hp on 17.01.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input text please: ");
        String text = sc.nextLine();

        System.out.println("Input position please:");
        int position = sc.nextInt();

        System.out.println("Input symbol please:");
        char symbol = sc.next().trim().charAt(0); // reading char from keyboard and avoiding spaces;
        sc.close();


        Sentence sentence = new Sentence(text);
        Changer changer = new Changer();
        System.out.print("Sentence before change: " + sentence.getText());
        changer.change(sentence, position, symbol);

        System.out.println();
        System.out.println("Sentence after change: " + sentence.getText());


       // System.out.println(new Changer().replace("We are gonna win", 2, '2'));
    }

}
