package CoreJava;

public class GarbageCollectionDemo1 {
    public GarbageCollectionDemo1(){

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collect"+this);
    }

    public static void main(String[] args) {
        GarbageCollectionDemo1 garbageCollectionDemo1=new GarbageCollectionDemo1();
        GarbageCollectionDemo1 garbageCollectionDemo2=new GarbageCollectionDemo1();

        /*garbageCollectionDemo1=null;
        garbageCollectionDemo2=null;*/

        System.gc();
        System.out.println("garbage collection called");

    }
}
