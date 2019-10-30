package main.java.com.OlehHilchenko.OGCollection;

import java.util.*;

public class OGCollectionsInt extends AbstractOGCollection implements OGCollection {

    int oGCollections[];
    int sortOGCollections[];
    int lengthCol;

    OGCollectionsInt() {
        oGCollections = new int[1];
        lengthCol = 1;
    }

    OGCollectionsInt(int... m) {
        oGCollections = m;
        AbstractOGCollection ogc = new OGCollectionsInt();
        sortOGCollections = ogc.sortArray(oGCollections);
        lengthCol = m.length;
    }

    @Override
    public void add(int o) {
        if (oGCollections[0] == 0 && lengthCol == 1)
            oGCollections[0] = o;
        else if (oGCollections[0] > 0 || oGCollections[0] < 0) {
            oGCollections = Arrays.copyOf(oGCollections, oGCollections.length + 1);
            lengthCol++;
            oGCollections[lengthCol - 1] = o;
        }
    }

    @Override
    public boolean delByIndex(int i) {
        if (i < lengthCol) {
            // Destination array
            int arrOut[] = Arrays.copyOf(oGCollections, oGCollections.length - 1);
            int remainingElements = oGCollections.length - (i + 1);
            // copying elements that come before the index that has to be removed
            System.arraycopy(oGCollections, 0, arrOut, 0, i);
            // copying elements that come after the index that has to be removed
            System.arraycopy(oGCollections, i + 1, arrOut, i, remainingElements);
            //System.out.println("Elements -- " + Arrays.toString(arrOut));
            this.oGCollections = arrOut;
            lengthCol--;
            return true;
        }
        return false;
    }

    @Override
    public int getByIndex(int i) {
        if (i < lengthCol) {
            return oGCollections[i];
        }
        return -1;
    }

    @Override
    public int getByValue(int val) {
        for (int i = 0; i < oGCollections.length; i++) {
            if (val == oGCollections[i])
                return oGCollections[i];
        }
        return -1;
    }

    @Override
    public int getMin() {
        if (lengthCol > 1) {
            int min = oGCollections[0];
            for (int i = 0; i < oGCollections.length; i++) {
                if (min > oGCollections[i])
                    min = oGCollections[i];
            }
            return min;
        }
        return -1;
    }

    @Override
    public int getMax() {
        if (lengthCol > 1) {
            int max = oGCollections[0];
            for (int i = 0; i < oGCollections.length; i++) {
                if (max < oGCollections[i])
                    max = oGCollections[i];
            }
            return max;
        }
        return -1;
    }

    @Override
    public int average() {
        if (oGCollections.length > 1 && oGCollections[0] != 0) {
            int average = 0;
            for (int i = 0; i < oGCollections.length; i++) {
                average += oGCollections[i];
            }
            average = average / lengthCol;
            return average;
        }
        return -1;
    }
}
