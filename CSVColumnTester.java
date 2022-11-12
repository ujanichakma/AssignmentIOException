public class CSVColumnTester {
    public static void main(String[] args)

    {

        //create an object for the "CSVcolumnSummary" class

        CSVSummaryReader summary = new CSVSummaryReader("att2007.csv");

        //display an average volume

        System.out.printf("The avg volume is: %.2f\n", summary.columnAvg(5));

        //display an expected average volume

        System.out.println("Expected: 166560.75");

        //display the minimum price

        System.out.printf("The min volume is: %.2f\n", summary.columnMin(5));

        //display an expected minimum price

        System.out.println("Expected: 22100.00");

        //display the maximum price

        System.out.printf("The max volume is: %.2f\n", summary.columnMax(5));

        //display an expected maximum price

        System.out.println("Expected: 8841040.00");

        //display an average price

        System.out.printf("The avg price is: %.2f\n", summary.columnAvg(6));

        //display an expected average price

        System.out.println("Expected: 22.63");

        //display the minimum price

        System.out.printf("The min price is: %.2f\n", summary.columnMin(6));

        //display an expected minimum price

        System.out.println("Expected: 20.77");

        //display the maximum price

        System.out.printf("The max price is: %.2f\n", summary.columnMax(6));

        //display an expected maximum price

        System.out.println("Expected: 23.73");

    }
}
