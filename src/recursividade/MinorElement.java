package recursividade;

import java.util.List;

public class MinorElement {
    public static void main(String[] args) {

        List<Double> list = List.of(new Double[]{10.0,15.0,20.0,8.0,30.0,17.0});
        System.out.printf(String.valueOf(minor(list)));
    }

    public static double minor(List<Double> list){
        if (list.size() == 1){
            return list.getFirst();
        }

        double head = list.getFirst();
        List<Double> tail = list.subList(1, list.size());

        double minor = minor(tail);

        return Math.min(head, minor);
    }
}
