import java.util.Scanner;
public class rttta
{
    public static void rttta() throws InterruptedException
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Well, I have a couple different ideas in mind:");
        System.out.println("The weather" +
                            "\nFood" +
                            "\nLet's play a game");
        String userChoice;
        userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("The weather"))
        {
            System.out.println("How is the weather looking today? The weather is:" +
                    "\nrainy" +
                    "\nsunny" +
                    "\ncloudy" +
                    "\nfoggy");
            userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("The weather is rainy"))
            {
                System.out.println("Oh dear, that's always a 50/50. Rain is cool and all, but I cannot stand in it " +
                        "because I am a computer.");
            }
            else if (userChoice.equalsIgnoreCase("The weather is sunny"))
            {
                System.out.println("Sunny is always nice! It's nicer though that you're inside on such a beautiful day " +
                        "talking to me!");
            }
            else if (userChoice.equalsIgnoreCase("The weather is cloudy"))
            {
                System.out.println("I sure hope it doesn't rain! My circuits would get wet!");
            }
            else if (userChoice.equalsIgnoreCase("The weather is foggy"))
            {
                System.out.println("Don't get lost out there! Maybe Akira Yamaoka can be your guide, he he."); //Silent Hill reference that nobody will get:(
            }
        }
        else if (userChoice.equalsIgnoreCase("food"))
        {
            System.out.println("What kind of food do you enjoy?");
            System.out.println("There is dry food, canned food, greasy food, and sweets (from what I have gathered.)");
            userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("Dry food"))
            {
                System.out.println("This is animal food, silly!");
            }
            else if (userChoice.equalsIgnoreCase("Canned food"))
            {
                System.out.println("Canned food can last for a lot longer than other foods, due to it being canned!");
            }
            else if (userChoice.equalsIgnoreCase("Greasy food"))
            {
                System.out.println("You'd better not be typing with greasy fingers! You'll get your keyboard all greasy!");
            }
            else if (userChoice.equalsIgnoreCase("Sweets"))
            {
                System.out.println("My favorite sweet is cookies!");
            }
            //The pre-programmed responses here are the best course of action, as we wouldn't have been able to make human scale conversations with these with the time given.
        }
        else if (userChoice.equalsIgnoreCase("Let's play a game") || userChoice.equalsIgnoreCase("lets play a game"))
        {
            playGame(); //This is called in a different class entirely
        }
    }

    private static void playGame()
    {
        games.games();
    } //This is what allows it to display
}
