public class A5_Question4 {


    public static int numPaths(int row, int col, int n)
    {
        if (row == n && col == n)
            return 1;
        else if (row == n)
            return numPaths(row, col+1, n);
        else if (col == n)
            return numPaths(row+1, col, n);
        else
            return numPaths(row+1, col, n) + numPaths(row, col+1, n);
    }

    public static void main(String[] args){
        int paths = numPaths(1, 1, 3);
        System.out.println("Number of paths: " + paths);
    }


}
