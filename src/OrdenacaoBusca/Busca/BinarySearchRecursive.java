package OrdenacaoBusca.Busca;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        System.out.println(binarySearchRecursive(new int[]{-5,0,2,8,13,16,19,23,29,34,38}, 34, 0, 11));

        System.out.println(binarySearchRecursive(new int[]{-5,0,2,8,13,16,19,23,29,34,38}, 10, 0, 11));

        System.out.println(binarySearchRecursive(new int[]{-10,-3,4,11,13,18,44,64,91,225,431}, 11,0, 11));
    }

    // O(logN)
    public static int binarySearchRecursive(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int middle = (low + high) / 2;
        if (array[middle] == key) {
            return middle;
        }else if (array[middle] > key) {
            return binarySearchRecursive(array, key, low, middle - 1);
        }else {
            return binarySearchRecursive(array, key, middle + 1, high);
        }
    }
}
