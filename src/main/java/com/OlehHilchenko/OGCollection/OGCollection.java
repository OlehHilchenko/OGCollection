package main.java.com.OlehHilchenko.OGCollection;

public interface OGCollection {

    void add(int o);

    boolean delByIndex(int i);

    int getByValue(int val);

    int getByIndex(int i);

    int getMax();

    int getMin();

    int average();

    int[] isSumOfValues(int e, int i[]);

    int[] duplicates(int[] inArray);
}
