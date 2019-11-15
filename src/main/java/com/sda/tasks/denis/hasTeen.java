package com.sda.tasks.denis;

public class hasTeen {
    public boolean hasTeen(int a, int b, int c) {
        int [] arr = {a, b, c};
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>=13 && arr[i]<=19) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        hasTeen t = new hasTeen();
        System.out.println(t.hasTeen(15, 17, 20));
    }
}
