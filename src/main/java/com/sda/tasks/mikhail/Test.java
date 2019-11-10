package com.sda.tasks.mikhail;

public class Test {
    public boolean hasTeen(int a, int b, int c) {
        int [] arr = {a, b, c};
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>=13 && arr[i]<=19) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hasTeen(15, 17, 20));
    }
}
