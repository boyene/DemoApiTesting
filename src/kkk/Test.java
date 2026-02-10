package kkk;

import java.io.File;
import java.io.IOException;

public class Test {
    static void main() {
        Integer a = null;
        int x = (a == null) ? 10 : a;
        System.out.println(x);
    }
}