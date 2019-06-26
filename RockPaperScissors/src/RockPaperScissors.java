
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Boolean play = true;
        while (play) {
            Scanner input = new Scanner(System.in);
            System.out.println("Does player one choose rock, paper or scissors?");
            String playerOne = input.next();


            // Generate random numbers between 0 and 2 for the computer
            Random rand = new Random();
            int rps = rand.nextInt(3);

            // Associate the random number to an index of a list
            ArrayList arr = new ArrayList();
            arr.add("rock");
            arr.add("paper");
            arr.add("scissors");
            Object computer = arr.get(rps);

            System.out.println("The computer chooses " + computer);
            System.out.println("------------------------------");
            System.out.println();


            if ((playerOne.equals("rock") && computer.equals("scissors")) || (playerOne.equals("paper") && computer.equals("rock"))
                    || (playerOne.equals("scissors") && computer.equals("paper"))) {
                System.out.println("Player one wins!");
            } else if ((playerOne.equals("rock") && computer.equals("rock")) || (playerOne.equals("paper") && computer.equals("paper"))
                    || (playerOne.equals("scissors") && computer.equals("scissors"))) {
                System.out.println("Tie");
            } else {
                System.out.println("Player two wins!");
            }

            System.out.println("Another try? (y)yes or (n)no? ");
            String choice = input.next();
            if (choice.equals("y")) {
                play = true;
            } else {
                play = false;
            }

        }
    }
}
