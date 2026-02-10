package Constructor;

public class TestDemo4 {
    public static void main(String[] args) {
        Lion l = new Lion("King Of Jungle");
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Lion extends Animal {
    Lion(String position) {
        super();
        System.out.println("Lion Constructor And Lion Is " + position);
    }
}
