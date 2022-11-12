import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumber5 {
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        String filename1 = null;

        if (args.length == 1)

        {
            filename1 = args[0];

        }
        else

        {

            System.out.print("Please enter the file name for input: ");

            filename1 = in.next();

        }

        System.out.print("Please enter the file name for output: ");

        String filename2 = in.next();
        try (Scanner inFile = new Scanner(new File(filename1))) {
            try (PrintWriter out = new PrintWriter(filename2)) {

                int count = 1;

                while (inFile.hasNext()) {

                    System.out.println("/* " + count + " */ " + inFile.nextLine());
                    count++;

                }

            }
        } catch (FileNotFoundException exception) {

            System.out.println("File not found!");

        }

    }

}
