package ExceptionHandling;

public class TestUnCheckedExceptionDemo2 {
    public static void main(String[] args){
        int[] numbers=new int[6];
        try {
            numbers[0]=101;
            numbers[1]=102;
            numbers[2]=103;
            numbers[3]=107;
            numbers[4]=100;
            numbers[5]=104;
            numbers[6]=90;
        }catch (ArrayIndexOutOfBoundsException a){
           // a.printStackTrace();
            System.out.println(a.getMessage());
            System.out.println(a.toString());
        }

        /*
        Total index=6;
        then you can't give other than 6
        otherwise will get ArrayIndexOutOfBoundsException
         */
       // numbers[6]=90;  //ArrayIndexOutOfBoundsException
        for (int a=0;a<numbers.length;a++){
            System.out.println(numbers[a]);
        }
        System.out.println("main method ended !!");
    }
}
