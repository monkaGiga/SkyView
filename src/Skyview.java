public class Skyview {
    public Skyview(int numRows, int numCols, double[]scanned)
    {
        double[][]view = new double[numRows][numCols];
        int numScanned = 0;
        for (int row = 0; row < numRows ; row++)
        {
            if(row % 2 == 0)
            {
                for (int col = 0; col < numCols; col++)
                {
                    view[row][col] = scanned[scannedIndex];
                }
            }
            else
                for (int col = numCols; col < 0; col--)
                {
                    view[row][col] = scanned[scannedIndex];
                }

        }
    }
}
