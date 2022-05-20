package com.saif.android.data;

import java.util.Random;

public class Act {

    public String[] ranTitle;
    public String[] ranOpt1;

    public void randomizeQ(String[] array, String[] array2){
        Random rgen = new Random();

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);

            String temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;

            String temp2 = array2[i];
            array2[i] = array2[randomPosition];
            array2[randomPosition] = temp2;
        }
        ranTitle = array;
        ranOpt1 = array2;
    }

    public String[] getTitle() {
        return null;
    }

    public String[] getOpt1() {
        return null;
    }

    public String[] getOpt3() {
        return null;
    }

    public String[] getOpt2() {
        return null;
    }

    public String[] getOpt4() {
        return null;
    }

    public String[] getRanTitle() {
        return ranTitle;
    }

    public String[] getRanOpt1() {
        return ranOpt1;
    }
}
