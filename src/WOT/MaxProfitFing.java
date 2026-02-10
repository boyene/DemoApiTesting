package WOT;

public class MaxProfitFing {
    static void main() {
        int[] arr = {13, 2,1,5,7,11,2};
        int minPrice=arr[0];
        int maxProfit=0;

        for (int i=1;i<arr.length;i++){
            if(arr[i]<minPrice){
               minPrice= arr[i];
            }
            int profit=arr[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }

        System.out.println(maxProfit);
    }


}
