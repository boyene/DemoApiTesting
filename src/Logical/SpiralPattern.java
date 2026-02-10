package Logical;

public class SpiralPattern {
    public static void main(String[] args) {
        int n=5;
        int [][] array=new int[n][n];

        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int number=1;

        while(top<=bottom && left<=right){

            //fill top row
            for(int a=left;a<=right;a++){
                array[top][a]=number++;
            }
            top++;
            //fill right column (top to bottom)
            for(int a=top;a<=bottom;a++){
                array[a][right]=number++;
            }
            right--;
            // Fill bottom row (right to left)
            for(int a=right;a>=left;a--){
                array[bottom][a]=number++;
            }
            bottom--;
            // Fill left column (bottom to top)
            for(int a=bottom;a>=top;a--){
                array[a][left]=number++;
            }
            left++;

        }
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                System.out.print(array[a][b]+" \t");
            }
            System.out.println();
        }


    }
}
