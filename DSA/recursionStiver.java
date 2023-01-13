public class recursionStiver {
    public static void printInc(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printInc(i + 1, n);
    }
    public static void printDec(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printDec(i - 1, n);
    }
    public static void searchKey(int i, int arr[], int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");            
        }
        searchKey(i+1, arr, key);
    }
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void converter(int n) {
        if (n == 0) {
            return;
        }
        int lastdigits = n % 10;
        converter(n  / 10);
        System.out.print(digits[lastdigits] + " ");
    }
    public static int printLength(String str) {
        if(str.length() == 0){
            return 0;
        }
        return printLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        // printDec(10, 10);
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // searchKey(0, arr, 2);
        // converter(1947);
        
        System.out.println();
    }
}
