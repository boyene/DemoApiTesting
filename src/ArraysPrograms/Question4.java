package ArraysPrograms;

public class Question4 {
    static public void main(String[] Dim) {
        int[][] grid = {{1, 2}, {3, 4}};
        int[] temp = grid[0];
        grid[0] = grid[1];
        grid[1] = temp;
        System.out.println("Array Output: " + grid[0][0] + " " + grid[1][1]);
    }
    }
