package ArraysPrograms;
//find the sum and avg of all given  numbers
public class TestDemo3 {
    public static void main(String[] args){

        int [] numbers={-10,66,56,42,-78,91,42,-20,53};
        double sum=0;
        double avg=0;
       /* for(int a=0;a<numbers.length;a++){
         sum =sum+  numbers[a];
        }*/
        //for each loop
        for(int num:numbers){
            sum=sum+num;
        }
        avg=sum/numbers.length;//Formula is Sum of total /all numbers.length;
        System.out.println("sum"+sum);
        System.out.println("avg"+avg);

    }
}
