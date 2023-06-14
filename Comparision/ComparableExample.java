package Comparision;

import java.util.Comparator;

public class ComparableExample {
    public static void main(String st[]) {

        Comparable c = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        Comparator c1= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }


}

