import java.util.Random;
import java.util.Scanner;
public class Jokes
{
    public static void jokes() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);

        int userInput = 0;

        System.out.println("Press 1 for a random joke. ");
        userInput = input.nextInt();

        String[] jokes;

        jokes = new String[20];

        jokes[0] = "The rotation of earth really makes my day! ";
        jokes[1] = "Q: What is Jafar when he is next to you? \nA: Ja-near! ";
        jokes[2] = "My friend did not want to hang out because he had a pimple. I think that is a pore excuse! ";
        jokes[3] = "Q: What do you call a belt made out of watches? \nA: A waist of time! ";
        jokes[4] = "Q: What concert costs 45 cents? \nA: 50 Cent featuring Nickelback.";
        jokes[5] = "Q: Did you hear about the red ship and the blue ship that collided? \nA: All of the sailors were marooned! ";
        jokes[6] = "Q: How many kids with ADD does it take to change a lightbulb? \nA: Let's go ride bikes! ";
        jokes[7] = "Q: Why was the broom late for work? \nA: It overswept. ";
        jokes[8] = "My Grandpa had the heart of a lion... And a life time ban from the Zoo. ";
        jokes[9] = "Q: What do you call a nosy pepper? \nA: JALAPENO BUSINESS! ";
        jokes[10] = "Q: Why did the skeleton go to the party alone? \nA: He had no body to go with him! ";
        jokes[11] = "A man didn't like his haircut... but it started to grow on him. ";
        jokes[12] = "A drum and a cymbal fall off a cliff... ";
        jokes[13] = "Q: Why wouldn't the shrimp share his treasure? \nA: Because he was a little shellfish.";
        jokes[14] = "Q: Why do the French never perform “the wave” at a soccer game? \nA: Because, that’s a gesture reserved for use only in time of war. ";
        jokes[15] = "Q: What did the fish say when he ran into the wall? \nA: Dam. ";
        jokes[16] = "Did you hear about the fire at the circus?... It was in tents!";
        jokes[17] = "Q: Who does a pharaoh talk to when he's sad? \nA: His mummy. ";
        jokes[18] = "Q: Why couldn't Dracula's wife get to sleep? \nA: Because of his coffin.";
        jokes[19] = "Chuck Norris always wins Connect Four... with three moves. ";

        int x = 1;

        if (userInput == 1){
            System.out.println("Your Random Joke: ");

            while (x <= 1) {
                Random rand = new Random();
                int computerChoice = rand.nextInt(20);

                if (computerChoice == 0) {
                    System.out.println(jokes[0]);
                } else if (computerChoice == 1) {
                    System.out.println(jokes[1]);
                } else if (computerChoice == 2) {
                    System.out.println(jokes[2]);
                } else if (computerChoice == 3) {
                    System.out.println(jokes[3]);
                } else if (computerChoice == 4) {
                    System.out.println(jokes[4]);
                } else if (computerChoice == 5) {
                    System.out.println(jokes[5]);
                } else if (computerChoice == 6) {
                    System.out.println(jokes[6]);
                } else if (computerChoice == 7) {
                    System.out.println(jokes[7]);
                } else if (computerChoice == 8) {
                    System.out.println(jokes[8]);
                } else if (computerChoice == 9) {
                    System.out.println(jokes[9]);
                } else if (computerChoice == 10) {
                    System.out.println(jokes[10]);
                } else if (computerChoice == 11) {
                    System.out.println(jokes[11]);
                } else if (computerChoice == 12) {
                    System.out.println(jokes[12]);
                } else if (computerChoice == 13) {
                    System.out.println(jokes[13]);
                } else if (computerChoice == 14) {
                    System.out.println(jokes[14]);
                } else if (computerChoice == 15) {
                    System.out.println(jokes[15]);
                } else if (computerChoice == 16) {
                    System.out.println(jokes[16]);
                } else if (computerChoice == 17) {
                    System.out.println(jokes[17]);
                } else if (computerChoice == 18) {
                    System.out.println(jokes[18]);
                } else if (computerChoice == 19) {
                    System.out.println(jokes[19]);
                }

                x++;
            }
        }
        else if (userInput != 1)
        {
            System.out.println("Have a good day anyway. ");
        }

    }

}
