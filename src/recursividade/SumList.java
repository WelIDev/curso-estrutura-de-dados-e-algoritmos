package recursividade;

import java.util.ArrayList;
import java.util.List;

public class SumList {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        System.out.println(sumList(list));
        List<Double> list1 = List.of(new Double[]{4.0, 5.0, 3.0});
        System.out.println(sumList(list1));
    }

    public static double sumList(List<Double> list) {
        if (list.isEmpty()) {
            return 0;
        }

        double head = list.getFirst();
        List<Double> tail = list.subList(1, list.size());

        return head + sumList(tail);
    }
}
