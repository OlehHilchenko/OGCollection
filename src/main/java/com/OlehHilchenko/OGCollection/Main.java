package main.java.com.OlehHilchenko.OGCollection;

public class Main {

    public static void main(String[] args) {
        OGCollection ogCollectionsInt = new OGCollectionsInt(43, 54, 61, 83, 74, 11, 20, 34);


        System.out.print("Array before sort: [");
        for (int i : ((OGCollectionsInt) ogCollectionsInt).oGCollections)
            System.out.print(i + ", ");
        System.out.println("]");
        int m[] = ogCollectionsInt.duplicates(((OGCollectionsInt) ogCollectionsInt).oGCollections);
        System.out.print("Array after sort: [");
        for (int i : ((OGCollectionsInt) ogCollectionsInt).sortOGCollections)
            System.out.print(i + ", ");
        System.out.print("]");
        System.out.println();
        for (int i = 0; i < m.length; i++)
            System.out.println("Number : " + m[i] + " duplicated " + m[++i] + " time.");

        System.out.println(" ");
        int i[] = ogCollectionsInt.isSumOfValues(72, ((OGCollectionsInt) ogCollectionsInt).oGCollections);
        System.out.print("member indices: ");
        for (int f : i)
            System.out.print(f + " ");
        System.out.println();


        OGCollection col2 = new OGCollectionsInt();

        col2.add(4);
        col2.add(6);
        col2.add(9);

        for (int x : ((OGCollectionsInt) col2).oGCollections)
            System.out.print(x + " ");

        col2.delByIndex(1);

        System.out.println();
        for (int x : ((OGCollectionsInt) col2).oGCollections)
            System.out.print(x + " ");

        col2.add(18);
        col2.add(55);
        col2.add(10);

        System.out.println();
        for (int x : ((OGCollectionsInt) col2).oGCollections)
            System.out.print(x + " ");

        System.out.println();
        System.out.println(col2.getByIndex(3));

        System.out.println();
        System.out.println(col2.getByValue(18));

        System.out.println();
        System.out.println(col2.getMax());

        System.out.println();
        System.out.println(col2.getMin());

        System.out.println();
        System.out.println(col2.average());

        col2.delByIndex(2);
        System.out.println();
        for (int x : ((OGCollectionsInt) col2).oGCollections)
            System.out.print(x + " ");
    }
}

