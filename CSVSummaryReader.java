public class CSVSummaryReader {
    private CSVReader reader;

    //definition of constructor

    public CSVcolumnSummary(String fileName)

    {

        //create an object for "CSVReader" class

        reader = new CSVReader(fileName);

    }

    //definition of "columnAvg" method

    public double columnAvg(int col)

    {

        //declare the variable

        double sum = 0;

        //iterate "row" until it reaches the declared value

        for (int row = 0; row < reader.numberOfRows(); ++row)

        {

            //calculate the sum

            sum += Double.parseDouble(reader.field(row, col));

        }

        //return the average

        return sum / reader.numberOfRows();

    }

    //definition of "columnMin" method

    public double columnMin(int col)

    {

        //declare the variable

        doublemin = Double.parseDouble(reader.field(0, col));

        //iterate "row" until it reaches the declared value

        for (int row = 1; row < reader.numberOfRows(); ++row)

        {

            //declare the variable

            double value = Double.parseDouble(reader.field(row, col));

            //check "value" is less than "min"

            if (value < min)

            {

                //set the value

                min = value;

            }

        }

        //return the value

        return min;

    }

    //definition of "columnMax" method

    public double columnMax(int col)

    {

        //declare the variable

        double max = Double.parseDouble(reader.field(0, col));

        //iterate "row" until it reaches the declared value

        for (int row = 1; row < reader.numberOfRows(); ++row)

        {

            //declare the variable

            double value = Double.parseDouble(reader.field(row, col));

            //check "value" is greater than "min"

            if (value > max)

            {

                //set the value

                max = value;

            }

        }

        //return the value

        return max;

    }

}
