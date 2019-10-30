package main.java.com.OlehHilchenko.OGCollection;

import java.util.*;


abstract public class AbstractOGCollection implements OGCollection {

    @Override
    public int[] isSumOfValues(int e, int[] i) {
        int input[] = i;

        int sumNamInd[] = new int[2];
        for (int x = 0; x < input.length; x++)
            for (int z = 0; z < input.length; z++) {
                if (input[x] + input[z] == e && input[x] != input[z]) {
                    sumNamInd[0] = x;
                    sumNamInd[1] = z;
                    return sumNamInd;
                }
            }

        return new int[0];
    }


    protected int[] sortArray(int[] in) {
        int input[] = in.clone();
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i + 1] < input[i]) {
                    int x = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = x;
                    count++;
                }
            }
        }
        return input;
    }

    private boolean printFalse() {
        return false;
    }

    private boolean printTrue() {
        return true;
    }

    //Дан массив целых чисел.
    //Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
    @Override
    public int[] duplicates(int[] input) {
        int inArray[] = sortArray(input.clone());
        int set[] = new int[1];
        set[0] = inArray[0];
        for (int num : inArray) {
            boolean trig = false;
            for (int i = 0; i < set.length; i++) {
                if (set[i] != num) {
                    trig = true;
                }
                if (set[i] == num) {
                    trig = false;
                }
            }
            if (trig) {
                set = Arrays.copyOf(set, set.length + 1);
                set[set.length - 1] = num;
            }
        }

        int duplicatesAndCounters[] = new int[2];
        int nav = 0;
        for (int i = 0; i < set.length; i++) {
            int count = 0;
            for (int num : inArray) {
                if (num == set[i])
                    count++;
            }
            if (count > 1) {
                if (duplicatesAndCounters[0] == 0) {
                    duplicatesAndCounters[duplicatesAndCounters.length - 2] = set[i];
                    duplicatesAndCounters[duplicatesAndCounters.length - 1] = count;
                    System.out.println(printTrue());
                } else {
                    duplicatesAndCounters = Arrays.copyOf(duplicatesAndCounters, duplicatesAndCounters.length + 2);
                    duplicatesAndCounters[duplicatesAndCounters.length - 2] = set[i];
                    duplicatesAndCounters[duplicatesAndCounters.length - 1] = count;
                }
            }
        }
        if (duplicatesAndCounters[0] == 0)
            System.out.println(printFalse());

        return duplicatesAndCounters;
    }
}
