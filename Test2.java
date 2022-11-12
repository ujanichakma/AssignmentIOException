import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args)
    {
        LineRemover.removeLines("lines.txt");
        int count = 0;

        try (Scanner in = new Scanner(new File("lines.txt")))
        {

            while (in.hasNextLine())
            {
                //get the input
                in.nextLine();
                //increment the value
                count++;
            }
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
        }

        System.out.println("Number of non-blank lines: " + count);
        System.out.println("Expected: 10");
    }
}
