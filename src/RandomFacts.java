import java.util.Random;
import java.io.*;
public class RandomFacts {
    public static void randFacts() {
        try {
            BufferedReader reader = new
                    BufferedReader(new FileReader("randFacts.txt")); //This makes the reader itself

            Random rand = new Random();
            int randNum = rand.nextInt(19);
            for (int i = 0; i < randNum; i++) {
                reader.readLine();
                //This whole segment here generates a random number, and after it does that it reads through the text file but wastes all of the
                //lines.
            }
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
            //This is what actually stores and prints that randomly selected line while the rest are wasted.
        } catch (IOException e) {
            e.printStackTrace();
            //This is what makes it so it doesn't break, or throw an out of bounds exception error.
        }
    }

}
