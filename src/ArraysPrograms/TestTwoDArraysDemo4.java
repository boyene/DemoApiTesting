package ArraysPrograms;

public class TestTwoDArraysDemo4 {
    public static void main(String[] args){
        int[][] num=new int[2][];
        num[0]=new int[3];
        num[1]=new int [3];

        num[0][0]=1;
        num[1][0]=2;

        num[0][1]=3;
        num[1][1]=4;

        num[0][2]=5;
        num[1][2]=6;

       /* for(int a=0;a<num.length;a++){
            for(int b=0;b<num[a].length;b++){
                System.out.print(num[a][b]+" ");
            }
            System.out.println();
        }*/

        for(int[] num1:num){
            for(int num2:num1){
                System.out.print(num2+" ");
            }
            System.out.println();
        }


    }
}
