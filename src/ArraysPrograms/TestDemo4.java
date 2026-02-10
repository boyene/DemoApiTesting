package ArraysPrograms;
//min number and max number
public class TestDemo4 {
    public static void main(String[] args){

        int[] num={-1,8,9,3,4,-6,2,4,22,34,-3,5,-755,82,5,562};
        System.out.println("Length Of Array is "+num.length);

        int min =num[0];
        int max =num[0];

       /* for(int a=0;a<num.length;a++){
           if (num[a]<min){
               min=num[a];
           }if(num[a]>max){
               max=num[a];
            }
        }*/
        for (int a:num){
            if(a<min){
                min=a;
            }else if(a>max){
                max=a;
            }
        }
        System.out.println("min"+min);
        System.out.println("max"+max);

    }
}
