package Constructor;

public class Person {
    int id;
    String name;

    public Person(int id,String name) {
        super();
        this.id=id;
        this.name=name;
    }
    //Copy Constructor
    Person(Person p){
        this(p.id, p.name);
    }

    public static void main(String[] args){
        Person p=new Person(1,"Ramu");
        System.out.println(p.id+" , " +p.name);

        Person p1=new Person(p);
        System.out.println(p1.id+" , " +p1.name);
    }
}
