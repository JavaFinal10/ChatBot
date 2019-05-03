import java.util.Random;
import java.io.*;
public class RandomFacts {
    public static void randFacts() {
        try
        {
            BufferedReader reader = new
                    BufferedReader(new FileReader("randFacts.txt"));
            reader.close();
        }
        catch (IOException e)
        {
            Random rand = new Random();
            System.out.println(e);
        }
    }

}
