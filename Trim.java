import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Trim {
    public static void trimBlankLines(String fileName)

    {
        ArrayList<String> lines = new ArrayList<>();

        boolean nonBlankFound = false;

        try (Scanner in = new Scanner(new File(fileName)))

        {

            while (in.hasNextLine())

            {
                String line = in.nextLine();

                if (!line.trim().isEmpty() || nonBlankFound)

                {

                    nonBlankFound = true;

                    lines.add(line);

                }

            }

        }


        catch (FileNotFoundException exception)

        {

            exception.printStackTrace();

        }

        ListIterator<String> it = lines.listIterator(lines.size());

        while (it.hasPrevious() && it.previous().trim().isEmpty())

        {
            it.remove();
        }

        try (PrintWriter out = new PrintWriter(fileName))

        {
            for (String line: lines)

            {

                out.println(line);

            }

        }

        catch (FileNotFoundException e)

        {
            e.printStackTrace();

        }

    }
}
