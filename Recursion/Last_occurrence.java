public class Last_occurrence {

    public static int lasOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lasOccur(arr, i + 1, key);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 7, 5,7};
        System.out.println(lasOccur(arr, 0, 8));
    }
}
