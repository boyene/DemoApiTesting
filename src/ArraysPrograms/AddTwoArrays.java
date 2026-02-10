package ArraysPrograms;

public class AddTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9};
        int size;

        if (a.length > b.length) {
            size = a.length;
        } else {
            size = b.length;
        }

        int c[] = new int[size];

        // 🔹 Fix: use only one loop instead of nested loops
        for (int i = 0; i < size; i++) {
            if (i < a.length && i < b.length) {
                c[i] = a[i] + b[i];
            } else if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }
        System.out.print(" { ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+",");
        }
        System.out.println("}");
    }
}
