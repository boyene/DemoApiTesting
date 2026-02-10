package Logical;

public class Tables {
    static public void main(String[] args){
        for(int a=1;a<=20;a++){ //how many tables want
            for(int b=1;b<=10;b++){//Stop at 10 or 20
                System.out.print(a+"*"+b+"="+(a*b)+" ");
            }
            System.out.println();
        }
    }
}
