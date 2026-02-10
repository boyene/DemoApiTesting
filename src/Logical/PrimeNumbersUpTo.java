    package Logical;

    public class PrimeNumbersUpTo {
        public static void main(String[] args) {
            System.out.println("Prime Numbers Up To 100 IS : ");

            for (int a=2;a<=100;a++){
                int fcount=0;
                for (int b=1;b<=a;b++){
                    if(a%b==0){
                        fcount++;
                    }
                }
                if (fcount == 2) { // Prime numbers have exactly 2 factors: 1 and itself
                    System.out.print(a + " ");
                }
            }
        }
    }
