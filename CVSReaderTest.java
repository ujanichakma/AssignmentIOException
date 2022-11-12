public class CVSReaderTest {
    public static void main(String[] args)
    {
        //create the objects for the "CSVReader" class
        CSVReader reader1 = new CSVReader("att2007.csv");
        CSVReader reader2 = new CSVReader("quotes.csv");
        //display the number of rows
        System.out.println("Number of rows: " + reader1.numberOfRows());
        //display the expected number of rows
        System.out.println("Expected: 214");
        //display the number of fields in row 10
        System.out.println("Number of fields in row 10: " + reader1.numberOfFields(10));
        //display the expected number of fields in row 10
        System.out.println("Expected: 7");
        //display the row 10 and column 2
        System.out.println("Row 10, Col 2: " + reader1.field(10, 2));
        //display the expected row 10 and column 2
        System.out.println("Expected: 24.95");
        //display the number of rows
        System.out.println("Number of rows: " + reader2.numberOfRows());
        //display the expected number of rows
        System.out.println("Expected: 2");
        //display the number of fields in row1
        System.out.println("Number of fields in row 1: " + reader2.numberOfFields(1));
        //display the expected number of fields in row1
        System.out.println("Expected: 4");
        //display the rows 1 and column 2
        System.out.println("Row 1, Col 2: " + reader2.field(1, 2));
        //display the expected rows 1 and column 2
        System.out.println("Expected: Hello, World");
        //display the rows 1 and column 3
        System.out.println("Row 1, Col 3: " + reader2.field(1, 3));
        //display the expected rows 1 and column 3
        System.out.println("Expected: He asked: \"Quo vadis?\"");
        //display the rows 0 and column 3
        System.out.println("Row 0, Col 3: " + reader2.field(0, 3));
        //display the statement
        System.out.println("Expected: \"..., that all men are created equal, ...\"");
    }
}
