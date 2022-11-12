import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebGate {
    public static void dumpScannerToFile(Scanner in, String filename)
    {
        try (PrintWriter outfile = new PrintWriter(filename))
        {
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                outfile.println(line);
            }
        }

        catch (FileNotFoundException e)
        {
            //display an error message
            System.out.println("Cannot write to file " + filename);
        }
    }

    public static void main(String[] args)
    {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the url to scan: ");

        String url = console.nextLine();

        System.out.println("Enter the file to write to: ");
        String fileName = console.nextLine();

        URL locator;
        try
        {
            locator = new URL(url);
            try (Scanner in = new Scanner(locator.openStream())) {
                //call the method
                dumpScannerToFile(in, fileName);
            }
            catch (IOException exception)
            {
                System.out.println("IO Exception!");
            }
        }
        catch (MalformedURLException exception)
        {
            System.out.println("Invalid URL.");
        }
    }
}
