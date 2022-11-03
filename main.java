import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter rock/paper/scissor : ");
            String player = input.next();

            String[] com = {"rock", "paper", "scissor"};
            Random rand = new Random();
            int comp = rand.nextInt(com.length);
            String computer = com[comp];

            System.out.println("you choose : "+player + "\nComputer : "+computer);
            if (player.equals("rock") && computer.equals("rock"))
                System.out.println("\nOh no! It's Tie...\n");
            else if (player.equals("paper") && computer.equals("paper"))
                System.out.println("\nOh no! It's Tie...\n");
            else if (player.equals("scissor") && computer.equals("scissor"))
                System.out.println("\nOh no! It's Tie...\n");

            else if (player.equals("rock") && computer.equals("scissor"))
                System.out.println("\nCongratulation! You win...\n");
            else if (player.equals("paper") && computer.equals("rock"))
                System.out.println("\nCongratulation! You win...\n");
            else if (player.equals("scissor") && computer.equals("paper"))
                System.out.println("\nCongratulation! You win...\n");
            else
                System.out.println("\n\tSorry! You loose...\n");


            System.out.print("press  0  for play again : ");
            answer = input.next();
        }
        while (answer.equals("0"));

    }
}
