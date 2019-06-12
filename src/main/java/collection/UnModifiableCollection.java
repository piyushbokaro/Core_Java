package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnModifiableCollection {
    private List<String> names = new ArrayList<String>();
    public void testConcurrency() {
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        Collection < String > dynamicView = Collections.unmodifiableCollection(names);
        for (String s: dynamicView) { 
            System.out.println("s = " + s);
            names.add("0");
        }
    }
    public static void main(String[] args) {
        UnModifiableCollection test = new UnModifiableCollection();
        test.testConcurrency();
    }
}