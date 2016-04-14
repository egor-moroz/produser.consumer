package Produser.Conumer;

import java.util.Comparator;

/**
 * Created by Егор on 07.04.2016.
 */
public class MyComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
