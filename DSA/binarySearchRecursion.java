public class binarySearchRecursion {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length)return true;
        if (arr[i - 1] > arr[i])return false;
        return isSorted(arr, i + 1);
    }
    // Calculate Sum of an array by recursion
    public static int calSum(int arr[], int i, int sum) {
        if(i == arr.length) return sum;
        int currSum = sum + arr[i];
        return calSum(arr, i + 1, currSum);
    }
    // check element present or not by linear search
    public static int presentOrNot(int arr[], int k, int i) {
        if(i == arr.length) return -1;
        if (arr[i] == k) return i;
        return presentOrNot(arr, k, i + 1);
    }
    // check element present or not by binary search
    public static int checkElement(int arr[], int key, int s, int e) {
        int mid = s + (e - s) / 2;
        if (s > e) return -1;
        if(arr[mid] == key) return mid;
        if(arr[mid] < key) return checkElement(arr, key, mid + 1, e);
        return checkElement(arr, key, s, mid - 1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 14, 16};
        //  System.out.print(presentOrNot(arr, 1, 0));
        System.out.println(checkElement(arr, 14, 0, arr.length));

    }
}
