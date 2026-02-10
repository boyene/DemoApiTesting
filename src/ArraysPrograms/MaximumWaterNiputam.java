package ArraysPrograms;

public class MaximumWaterNiputam {
    static void main() {
        int []arr={1,8,5,4,9,7,8,7,2};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int temp1=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j])

                    temp1=arr[i]*(j-i);
                else
                    temp1=arr[j]*(j-i);
                if(max<temp1){
                    max=temp1;
                }
            }

        }
        System.out.println(max);
    }
}
