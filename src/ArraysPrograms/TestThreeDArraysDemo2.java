package ArraysPrograms;

public class TestThreeDArraysDemo2 {
    public static void main(String[] args){
        int [][][] numbers={{
                            {1,2,3,4},{5,6,7,8},{9,0,1,2},{1,1,6,6}},
                            {{1,3,5,3},{4,6,3,6},{1,3,5,3},{4,6,3,6}}};

        for (int[][] number : numbers) {
            for (int[] ints : number) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
