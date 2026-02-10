package ArraysPrograms;

public class Question7 {
    public static void main(String[] args) {
      int[] arr={4,2,3,4,4,2,1,3};
     int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                while (arr[i]==arr[j] && arr[j]==arr[i]){
                    i++;
                    count++;
                }
            }
            if(count>0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
