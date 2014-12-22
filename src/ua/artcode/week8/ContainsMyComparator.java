package ua.artcode.week8;

import ua.artcode.week3.day2.time_check.TimeAction;
import ua.artcode.week3.day2.time_check.TimeChecker;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by admin on 22.12.2014.
 */
public class ContainsMyComparator {

    private Collection first;
    private Collection second;
    private int dataSize;
    private Object[] data;

    public ContainsMyComparator(Collection first, Collection second, int dataSize) {
        this.first = first;
        this.second = second;
        this.dataSize = dataSize;
        genData();
        fillIn();
    }

    public void fillIn(){
        List list = Arrays.asList(data);
        first.addAll(list);
        second.addAll(list);
    }

    public void genData(){
        Object[] mas = new Object[dataSize];
        for(int i = 0; i < dataSize; i++){
            mas[i] = i;
        }
        this.data = mas;
    }

    public void compare(){
        final Object last = data[dataSize - 1];

        System.out.println("First collection contains");

        TimeChecker.check(new TimeAction() {
            @Override
            public void action() {
                first.contains(last);
            }
        });

        System.out.println("Second collection contains");
        TimeChecker.check(new TimeAction() {
            @Override
            public void action() {
                second.contains(last);
            }
        });

    }

}
