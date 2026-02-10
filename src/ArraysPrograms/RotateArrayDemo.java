package ArraysPrograms;

public class RotateArrayDemo {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int k=4;
       int n= arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i <n ; i++) {
            rotated[i]=arr[(i+k)%n];
        }
        System.out.print(" { ");
        for (int num:rotated) {
            System.out.print(num+" ");
        }
        System.out.print(" } ");
    }
}
