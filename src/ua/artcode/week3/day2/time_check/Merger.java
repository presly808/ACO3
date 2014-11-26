package ua.artcode.week3.day2.time_check;

import ua.artcode.week3.day2.time_check.TimeAction;

public class Merger implements TimeAction {

    private int[] mas1;
    private int[] mas2;

    public Merger(int[] mas1, int[] mas2) {
        this.mas1 = mas1;
        this.mas2 = mas2;
    }

    public int[] merge() {
        int[] res = new int[mas1.length + mas2.length];

        for (int i = 0, j = 0, k = 0; k < res.length; k++) {
            if (i >= mas1.length) {
                res[k] = mas2[j++];
            } else if (j >= mas2.length) {
                res[k] = mas1[i++];
            } else if(mas1[i] < mas2[j]){
                res[k] = mas1[i++];
            } else {
                res[k] = mas2[j++];
            }
        }
        return res;
    }


    @Override
    public void action() {
        merge();
    }
}
