package recursividade;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.println(reverse(list));

        List<String> list1 = List.of(new String[]{"azul"});
        System.out.println(reverse(list1));

        List<String> list2 = List.of(new String[]{"azul", "verde", "preto", "rosa"});
        System.out.println(reverse(list2));
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        T head = list.getFirst();
        List<T> tail = new ArrayList<>(list.subList(1, list.size()));

        List<T> reverseList = reverse(tail);
        reverseList.add(head);

        return reverseList;
    }
}
