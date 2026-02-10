package ArraysPrograms;

public class TestDemo1 {
    public static void main(String[] args){
    int[] hsno=new int[5];
    hsno[0]=515;
        hsno[1]=511;
        hsno[2]=651;
        hsno[3]=745;
        hsno[4]=985;

       /* for(int a=0;a<hsno.length;a++){
            System.out.println(hsno[a]);
        }*/

        //for each loop
        for (int hs:hsno){
            System.out.print(hs+" ");
        }
    }
}
