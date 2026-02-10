package ArraysPrograms;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,9};

        int start=arr[0];
        int end=arr[arr.length-1];

        for (int i = start; i < end; i++) {
            boolean found=false;
            for (int n:arr){
                if (n==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(i+" ");
            }
        }
    }
}
