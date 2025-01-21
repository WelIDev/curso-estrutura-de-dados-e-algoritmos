package recursividade;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {

        List<Integer> a = List.of(new Integer[]{10,20,30});
        List<Integer> b = List.of(new Integer[]{5,8,7});
        System.out.println(mergeLists(a, b));

        List<String> a1 = List.of(new String[]{"ana","maria"});
        List<String> b2 = List.of(new String[]{"joao","bob","alex","leo"});
        System.out.println(mergeLists(a1, b2));
    }

    public static <T> List<T> mergeLists(List<T> a, List<T> b) {

        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;

        T headA = a.getFirst();
        List<T> tailA = a.subList(1, a.size());
        T headB = b.getFirst();
        List<T> tailB = b.subList(1, b.size());

        List<T> result = new ArrayList<>();
        result.add(headA);
        result.add(headB);
        result.addAll(mergeLists(tailA, tailB));
        return result;
    }
}
