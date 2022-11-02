public class First_occurrence {
    public static int firOccurrence(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firOccurrence(arr, i + 1, key);
        // return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 2, 4, 7 };
        System.out.println(firOccurrence(arr, 0, 7));
    }

}
