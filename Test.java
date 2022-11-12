import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)

    {

        //open a file name hello.txt

        try (Scanner in = new Scanner(new File("hello.txt")))

        {

            String message;
            message = in.nextLine();
            System.out.println(message);

        }
        catch (FileNotFoundException exception)

        {
            exception.printStackTrace();

        }

        try (PrintWriter out = new PrintWriter("hello.txt"))

        {

            //store the message Hello, World! in the file

            out.println("Hello, World!");

        }

        catch (FileNotFoundException exception)

        {
            exception.printStackTrace();

        }

    }

}
