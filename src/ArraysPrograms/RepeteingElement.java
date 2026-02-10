package ArraysPrograms;

public class RepeteingElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,9};
        int n=arr.length+1;
        int sum=0;
        int total=n*(n+1)/2;
        for (int i : arr) {
            sum+=i;
        }
        int missing=total-sum;
        System.out.println("missing number : "+missing);
        for(int j=0;j<arr.length;j++){
            if(arr[j]>missing){
                System.out.println("index of missing number : "+j);
            }
        }
    }
}
