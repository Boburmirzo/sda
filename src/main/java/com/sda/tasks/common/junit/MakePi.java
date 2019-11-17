package com.sda.tasks.common.junit;

public class MakePi {

    public static int[] makePi(int length) {
        int[] answer = new int[length];
        int Pi = (int)(Math.PI*(Math.pow(10,length-1)));
        String PiString = Integer.toString(Pi);

        for (int i=0;i<length;i++){
            answer[i] = Character.getNumericValue(PiString.charAt(i));
        }
        return answer;
    }
}
