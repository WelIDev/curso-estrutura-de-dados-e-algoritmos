package recursividade;

import java.util.ArrayList;
import java.util.List;

public class IsSorted {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        System.out.println(isSorted(list));

        List<Double> list1 = List.of(new Double[]{15.0,20.0,22.0,31.0,40.0});
        System.out.println(isSorted(list1));

        List<Double> list2 = List.of(new Double[]{15.0,20.0,22.0,21.0,40.0});
        System.out.println(isSorted(list2));
    }

    public static boolean isSorted(List<Double> list) {
        if (list.size() <= 1) {
            return true;
        }

        if (list.getFirst() > list.get(1)) {
            return false;
        }
        List<Double> tail = list.subList(1, list.size());

        return isSorted(tail);
    }
}
