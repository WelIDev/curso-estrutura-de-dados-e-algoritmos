package OrdenacaoBusca.Busca;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{-5,0,2,8,13,16,19,23,29,34,38}, 34));

        System.out.println(binarySearch(new int[]{-5,0,2,8,13,16,19,23,29,34,38}, 10));

        System.out.println(binarySearch(new int[]{-10,-3,4,11,13,18,44,64,91,225,431}, 11));
    }
    // O(log N)
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int middle;
        int high = array.length - 1;

        while (low < high) {
            middle = (low + high) / 2;
            if (key < array[middle]) {
                high = middle - 1;
            }else if (key > array[middle]) {
                low = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
