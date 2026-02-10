package ArraysPrograms;

public class TestDemo6 {
    public static void main(String[] args){
        String[] names={"yellakrishna","Ramu","Radhika","Bahubali","sai"};

        for(int a=0;a<names.length;a++){
           /* if(names[a].contains("y")){
                System.out.println(names[a]);
            }*/
           /* if(names[a].startsWith("y")){
                System.out.println(names[a]);
            }*/
            if(names[a].endsWith("a")){
                System.out.println(names[a]);
            }

        }

    }
}
