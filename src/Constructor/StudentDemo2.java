package Constructor;

public class StudentDemo2 {
    //SingleTon
    private StudentDemo2(){

    }
    public static void main(String[] args){
        StudentDemo2 s2=new StudentDemo2();
        StudentDemo2 s3=new StudentDemo2();
        System.out.println(s2.hashCode() );
    }

}
