package Algorithms;
// сложность O(n^2)
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 1, 5, 7, 3, 0};

        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0, j = 0;
        int index = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[index++] = l[i];
                i++;
                index++;
            } else {
                arr[index++] = r[j];
                i++;
                index++;
            }
        }

        for (int ll = i; ll < left; ll++) {
            arr[index++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            arr[index++] = r[rr];
        }
    }
}
