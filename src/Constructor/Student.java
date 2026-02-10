package Constructor;

public class Student  implements Cloneable{
    int id;
    String name;
    String emailId;

    Student(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.emailId=email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("emailId : "+emailId);
        System.out.println();
    }
    public static void main(String[] args) {

        try {
            Student s1 = new Student(101, "Krishna", "krishna@gmail.com");
            s1.display();
            System.out.println("-------------------Clone------------------");


               Student s2 = (Student) s1.clone();
            s2.display();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }



    }
}
