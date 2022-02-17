package com.company;

public class FirstTask {
    public static void main(String[] args) {
        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = a1 || a2; // t
        System.out.println(a3);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 && b2; // f
        System.out.println(b3);
        boolean c = true;
        boolean d = false;
        boolean e = true;
        boolean result = c && (d || e); // t
        System.out.println(result);

        boolean g = true;
        boolean h = !g;
        System.out.println(h);

    }
}
