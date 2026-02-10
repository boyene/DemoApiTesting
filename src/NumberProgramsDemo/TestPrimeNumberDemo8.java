package NumberProgramsDemo;

public class TestPrimeNumberDemo8 {
    public static void main(String[] args){
        System.out.println("Prime numbers between 1 and 10:");
        for(int a=1;a<=100;a++){
            int fcount=0;
            for(int b=1;b<=a;b++){
                if(a%b==0){
                    fcount++;
                }
            }
            if(fcount==2){
                System.out.println(a);
            }
        }
    }
}
