package ArraysPrograms;

public class LeadersInTheArray {
    public static void main(String[] args) {
        int[] array={10,21,11,18,17,6,22};
        for (int i = 0; i < array.length; i++) {
            boolean status=true;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]<array[j]){
                    status=false;
                  break;
                }
            }
            if(status){
                System.out.print(" "+array[i]);
            }
        }

    }
}
