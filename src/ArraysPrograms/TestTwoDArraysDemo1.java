package ArraysPrograms;

public class TestTwoDArraysDemo1 {
    public static void main(String[] args){
        int[][] numbers=new int[3][3]; //  0,1,2  // 0,1,2
        /*
            00 01 02
            10 11 12
            20 21 22
         */
        // [0][0],[1][0],[2][0]
        numbers[0][0]=5;
        numbers[1][0]=4;
        numbers[2][0]=3;

        // [0][1],[1][1],[2][1]
        numbers[0][1]=6;
        numbers[1][1]=7;
        numbers[2][1]=8;

        // [0][2],[1][2],[2][2]
        numbers[0][2]=1;
        numbers[1][2]=2;
        numbers[2][2]=10;


       /* for (int a=0;a<numbers.length;a++){
            for(int b=0;b<numbers[a].length;b++){
                    System.out.print(numbers[a][b]+" ");
            }
            System.out.println();
        }*/

        for(int [] num:numbers){
            for(int num1:num){
                System.out.print(num1+" ");
            }
            System.out.println();
        }

    }
}
