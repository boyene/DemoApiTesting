package Patterns;

public class SnakePattern {
    public static void main(String[] args) {
        int k=3;
        int n=1;
        int[][] arr=new int[k][k];

        for(int i=0;i<k;i++){
           if(i%2==0){
               for(int j=0;j<k;j++){
                   arr[i][j]=n++;
               }
           }else {
               for(int j=k-1;j>=0;j--){
                   arr[i][j]=n++;
               }
           }
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print(arr[i][j]+"\t ");
            }
            System.out.println();
        }

    }
}
