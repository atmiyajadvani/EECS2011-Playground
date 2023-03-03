package JAVAProgram;

public class SumofElements_2DArray {

    int[][] arr = { { 1, 2 }, { 3, 4 } };
    int result = sumArray(arr, 0, 0);


    public int sumArray(int[][] arr, int row, int col) {
        if (row < 0 || col < 0) {   // base case: we have gone out of bounds
            return 0;
        } else {
            int current = arr[row][col];   // current element
            int sumBelow = sumArray(arr, row-1, col);   // sum of elements below current
            int sumRight = sumArray(arr, row, col-1);   // sum of elements to the right of current
            return current + sumBelow + sumRight;   // sum up all values
            System.out.println(current + sumBelow + sumRight);
        }
    }

}
