package ArraysPrograms;

public class TesThreeDArrayDemo1 {
    public static void main(String[] args){
        int[][][] numbers=new int[3][3][3]; //  0,1,2  // 0,1,2 //0,1,2
        /*
           000 001 002
           010 011 012
           020 021 022

           100 101 102
           110 111 112
           120 121 122

           200 201 202
           210 211 212
           220 221 222
         */



        //1st
        //
        /*
        [0][0][0],
        [0][1][0],
        [0][2][0].
         */
        numbers[0][0][0]=1;
        numbers[0][1][0]=2;
        numbers[0][2][0]=3;

        /*
        [0][0][1]
        [0][1][1]
        [0][2][1]
         */
        numbers[0][0][1]=4;
        numbers[0][1][1]=5;
        numbers[0][2][1]=6;

        /*
        [0][0][2]
        [0][1][2]
        [0][2][2]
         */
        numbers[0][0][2]=7;
        numbers[0][1][2]=8;
        numbers[0][2][2]=9;

        // 2nd
         /*
        [1][0][0],
        [1][1][0],
        [1][2][0].
         */
        numbers[1][0][0]=11;
        numbers[1][1][0]=12;
        numbers[1][2][0]=13;

        /*
        [1][0][1]
        [1][1][1]
        [1][2][1]
         */
        numbers[1][0][1]=14;
        numbers[1][1][1]=15;
        numbers[1][2][1]=16;

        /*
        [1][0][2]
        [1][1][2]
        [1][2][2]
         */
        numbers[1][0][2]=17;
        numbers[1][1][2]=18;
        numbers[1][2][2]=19;

        //3rd
         /*
        [2][0][0],
        [2][1][0],
        [2][2][0].
         */
        numbers[2][0][0]=21;
        numbers[2][1][0]=22;
        numbers[2][2][0]=23;

        /*
        [2][0][1]
        [2][1][1]
        [2][2][1]
         */
        numbers[2][0][1]=24;
        numbers[2][1][1]=25;
        numbers[2][2][1]=26;

        /*
        [2][0][2]
        [2][1][2]
        [2][2][2]
         */
        numbers[2][0][2]=27;
        numbers[2][1][2]=28;
        numbers[2][2][2]=29;

        for(int a=0;a<numbers.length;a++){
            for(int b=0;b<numbers[a].length;b++){
                for(int c=0;c<numbers[a][b].length;c++){
                    System.out.print(numbers[a][b][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        /*for(int[][] n:numbers){
            for (int [] n1:n){
                for (int number:n1){
                    System.out.print(number+" ");
                }
                System.out.println();
            }
            System.out.println();
        }*/

    }
}
