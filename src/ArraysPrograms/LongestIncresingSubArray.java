package ArraysPrograms;

public class LongestIncresingSubArray {
    public static void main(String[] args) {
        int [] a={1,2,2,3,4};
        int maxlen=1;
        int start=0;
        int maxstart=0;
        for (int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                int length=i-start+1;
                if(length>maxlen){
                    maxlen=length;
                    maxstart=start;
                }
            }else{
                start=i;
            }
        }
        for (int j=maxstart; j<maxstart+maxlen;j++){
            System.out.print(a[j]+" ");
        }
    }
}
