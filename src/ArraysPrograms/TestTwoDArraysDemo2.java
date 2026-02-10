package ArraysPrograms;

public class TestTwoDArraysDemo2 {
    public static void main(String[] args){
        int [][] num=new int[2][3];//first rows 2nd column // 0 1 // 0 1 2

        /*
            00 01 02
            10 11 12
         */

        num[0][0]=1;
        num[1][0]=2;

        num[0][1]=3;
        num[1][1]=4;

        num[0][2]=5;
        num[1][2]=6;

       /* for(int a=0;a<num.length;a++){//Represent rows
            for (int b=0;b<num[a].length;b++){ // Represent for Columns
                System.out.print(num[a][b]+" ");
            }
            System.out.println();
        }*/
        for(int[] num1:num){
            for (int num2:num1){
                System.out.print(num2+" ");
            }
            System.out.println();
        }

    }
}
