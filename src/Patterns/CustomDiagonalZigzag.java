package Patterns;

public class CustomDiagonalZigzag {
    public static void main(String[] args) {
        int k=4;
        int[][] array=new int[k][k];
        int number=1;

        for (int a = 0; a < k; a++) {
            int rows=0;
            int column=a;
            while (rows < k&& column >= 0){
                array[rows][column]= number++;
                rows++;
                column--;
            }
        }
        for (int a = 1  ; a < k; a++) {
            int rows=a;
            int column=k-1;
            while (rows< k&& column>=0){
               array[rows][column]= number++;
               rows++;
               column--;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
