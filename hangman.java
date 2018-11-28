import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Objects;

public class Hangman {

    public static void printBoard() {
        ArrayList<String> words = new ArrayList<>();
        words.add("waffle");
        words.add("photosynthesis");
        words.add("luxurious");
        words.add("elephant");
        words.add("friend");
        words.add("enemy");
        words.add("raider");
        words.add("egregious");
        words.add("fireplace");

        Random r = new Random();
        String word = words.get(r.nextInt(words.size()));

        String spaces = "";
        String board = "";

        for (int i=0; i<word.length(); i++){
            board += "_ ";
        }
        System.out.println(String.format("The board is: %s", word));
        System.out.println(board);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a letter.");
        String guess = input.next();

        Boolean correctGuess = false;
        board = "";

        for (int i=0; i<word.length(); i++){
            String charInWord = Character.toString(word.charAt(i));

            if (Objects.equals(charInWord, guess)) {
                board += String.format("%s ", guess);
                correctGuess = true;
            } 
            else {
                board += "_ ";
            }
        }

        if (correctGuess) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        System.out.println(board);
    }
    public static void main (String[] args) {
        printBoard();
    }
}