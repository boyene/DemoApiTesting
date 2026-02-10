package Patterns;

public class PatternTestDemo01 {
    public static void main(String[] args) {
        int k=5;
        int [][] array=new int[k][k];

        int top=0;
        int number=1;


        while (top<k){
            if(top%2==0){
                for (int i = 0; i <k ; i++) {
                    array[top][i]=number++;
                }
            }else {
                for (int i = k-1; i >=0; i--) {
                    array[top][i]=number++;
                }
            }
            top++;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
