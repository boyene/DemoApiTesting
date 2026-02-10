package ArraysPrograms;

public class TestDemo2 {
    public static void main(String[] args){
        //Another Way Of initializing data
        int[] numbers= {10,20,30,40,50,60,70,80,90,100};
        System.out.println(numbers);//[I@65ab7765

        for(int a=0;a<numbers.length;a++){
            System.out.print(numbers[a]+" ");
        }
    }
}
