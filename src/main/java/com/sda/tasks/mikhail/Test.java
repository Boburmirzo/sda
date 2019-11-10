package com.sda.tasks.mikhail;

public class Test {
    public boolean hasTeen(int a, int b, int c) {
        int [] arr = new int [3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>=13 && arr[i]<=19) return true;
        }
        return false;
    }
}
