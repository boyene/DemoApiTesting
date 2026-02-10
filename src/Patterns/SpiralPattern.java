package Patterns;

public class SpiralPattern {
    public static void main(String[] args) {
        int k=3;

        int[][] array=new int[k][k];

        int top=0;
        int left=0;
        int bottom=k-1;
        int right=k-1;

        int number=1;

        while (top<=bottom && left<=right ){
            for (int i = left; i <=right ; i++) {
                array[top][i]=number++;
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                array[i][right]=number++;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                array[bottom][i]=number++;
            }

            bottom--;

            for (int i = bottom; i >=top ; i--) {
                array[i][left]=number++;
            }
            left++;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(array[i][j]+"\t ");
            }
            System.out.println();
        }
    }
}
