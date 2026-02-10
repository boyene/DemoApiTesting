package CoreJava;

public class StudentDemo {
    public static void main(String[] args){
        Student s=new Student();
        /*System.out.println(s.id+" "+s.name+" "+s.emailId);*/
        s.setId(1);
        s.setName("Ramu");
        s.setEmailId("yellakrishnaboyene@gmail.com");

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getEmailId());
    }
}
