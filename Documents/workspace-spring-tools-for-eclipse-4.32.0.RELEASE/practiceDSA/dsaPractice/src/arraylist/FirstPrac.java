package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class FirstPrac {

    public static void main(String[] args) {

        ArrayList<Integer> fp = new ArrayList<Integer>();

        fp.add(0);
        fp.add(2);
        fp.add(3);
        System.out.println(fp);

        int element = fp.get(0);
        System.out.println(element);

        fp.add(1, 1);
        System.out.println(fp);

        fp.set(0, 5);
        System.out.println(fp);

        fp.remove(3);
        System.out.println(fp);

        int size = fp.size();
        System.out.println(size);

        for (int i = 0; i < fp.size(); i++) {
            System.out.println(fp.get(i));
        }

        // Sort the list
        Collections.sort(fp);
        System.out.println("After sorting: " + fp);
    }
}
