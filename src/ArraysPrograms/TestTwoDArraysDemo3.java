package ArraysPrograms;

public class TestTwoDArraysDemo3 {
    public static void main(String[] args){
        //Another way of creating 2D Array
        int[][] numbers={{1,5,3},{5,6,3},{8,9,10},{1,1,2},{8,6,2}};

       /* for(int a=0;a<numbers.length;a++){
            for(int b=0;b<numbers[a].length;b++){
                System.out.print(numbers[a][b]+" ");
            }
            System.out.println();
        }*/
        for(int[] num:numbers){
            for(int num1:num){
                System.out.print(num1+" ");
            }
            System
                    .out.
                    println();
        }
    }
}
