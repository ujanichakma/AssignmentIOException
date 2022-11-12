import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DualGender {
    public static String processName(Scanner in)

    {

        String name = in.next();

        int count = in.nextInt();

        double percent = in.nextDouble();

        return name;

    }

    public static void printSameNames(ArrayList<String> boyNames, ArrayList<String> girlNames)

    {

        for (String name : boyNames)

        {

            if (girlNames.contains(name))

            {

                System.out.println(name);

            }

        }

    }

    public static void main(String[] args)

    {

        try (Scanner in = new Scanner(new File("babynames.txt")))

        {

            ArrayList<String> boyNames = new ArrayList<String>();

            ArrayList<String> girlNames = new ArrayList<String>();

            while (in.hasNextInt())

            {

                int rank = in.nextInt();

                boyNames.add(processName(in));
                girlNames.add(processName(in));

            }

            printSameNames(boyNames, girlNames);

        }

        catch (IOException exception)

        {
            exception.printStackTrace();

        }

    }
}
