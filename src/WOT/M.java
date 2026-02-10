package WOT;

public class M {
    static void main() {
        int[] arr={3,4,5,6,10};

        int max=arr[0];
        for(int n:arr){
            if(n>max){
                max=n;
            }
        }
        boolean[] present=new boolean[max+1];

        for(int n:arr){
            present[n]=true;
        }
        System.out.println("missing Numbers : ");
        for(int i=1;i<=max;i++){
            if(!present[i]){
                System.out.print(i+" ");
            }

        }

    }
}
