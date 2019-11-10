package com.sda.tasks.mariam.codingbat;

public class Makes10 {
    public static void main(String[] args) {
        Makes10 n = new Makes10();
        boolean compare = n.makes10(3, 7);
        System.out.println(compare);
    }

    public boolean makes10(int a, int b) {
        int c = a + b;
        return (a == 10 || b == 10 || c == 10) ? true : false;
    }
}
