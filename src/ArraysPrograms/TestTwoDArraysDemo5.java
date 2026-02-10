package ArraysPrograms;

public class TestTwoDArraysDemo5 {
    public static void main(String[] args){
        String[][] names={{"HKlassen","Head","Bhuvi"
                            ,"Markaram","AbhiSheakSharma"}};

        for(String[] name:names){
            for (String namee:name){
                System.out.print(namee+" ");
            }
            System.out.println();
        }

    }
}
