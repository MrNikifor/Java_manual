package Algorithms;

import java.util.Arrays;

// сложность O(n^2)
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print); // Вывод отсортированного массива
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) { // Условие выхода из рекурсии
            return;
        }
        int pi = partitional(arr, left, right);
        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
    }

    private static int partitional(int[] arr, int left, int right) {
        int pivot = arr[right]; // Опорный элемент
        int ptr = left - 1; // Индекс меньшего элемента

        for (int i = left; i < right; i++) { // Начинаем с left и заканчиваем на right
            if (arr[i] < pivot) {
                ptr++;
                swap(ptr, i, arr); // Меняем местами элементы
            }
        }
        swap(ptr + 1, right, arr); // Меняем опорный элемент с элементом после последнего меньшего
        return ptr + 1; // Возвращаем индекс опорного элемента
    }

    private static void swap(int ptr, int i, int[] arr) {
        int temp = arr[ptr];
        arr[ptr] = arr[i];
        arr[i] = temp;
    }
}
