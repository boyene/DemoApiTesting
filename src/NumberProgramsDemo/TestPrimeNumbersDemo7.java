package NumberProgramsDemo;

public class TestPrimeNumbersDemo7 {

    public static void main(String[] args){
        int k=5;
        int fcount=0;
        for(int a=1;a<=k;a++){
            if(k%a==0){
                fcount++;
                System.out.println(a);
            }

        }
        System.out.println("Factors Count : "+fcount);

        if(fcount==2){
            System.out.println(k + " is a prime number.");
        } else {
            System.out.println(k + " is not a prime number.");
        }
    }

}
