package desafios.sortBenchmark;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

public class SortBenchmark {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Dev\\Workspace\\curso-estrutura-de-dados-e-algoritmos\\src\\desafios\\sortBenchmark\\benchmark.json";

        benchmarkSort(filePath, "Insertion Sort", SortBenchmark::insertionSort);
        benchmarkSort(filePath, "Bubble Sort", SortBenchmark::bubbleSort);
        benchmarkSort(filePath, "Quick Sort", SortBenchmark::quickSort);
    }

    private static void benchmarkSort(String filePath, String sortName, SortFunction sortFunction) throws IOException {
        String[] json = readJson(filePath);
        Instant start = Instant.now();
        sortFunction.sort(json);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.printf("%s: %dms\n", sortName, duration);
    }

    @FunctionalInterface
    interface SortFunction {
        void sort(String[] array);
    }

    public static String[] readJson(String fileName) throws IOException {
        String json = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
        Gson gson = new Gson();

        Type listType = new TypeToken<String[]>() {
        }.getType();

        return gson.fromJson(json, listType);
    }

    private static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(temp) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    private static void bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void quickSort(String[] array) {
        quicksortTailRecursive(array, 0, array.length - 1);
    }

    private static void quicksortTailRecursive(String[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quicksortTailRecursive(array, left, pivot - 1);
            quicksortTailRecursive(array, pivot + 1, right);
        }
    }

    private static int partition(String[] array, int left, int right) {
        String pivot = array[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j].compareTo(pivot) < 0) {
                swap(array, j, i);
                i++;
            }
        }
        swap(array, i, right);
        return i;
    }

    private static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
