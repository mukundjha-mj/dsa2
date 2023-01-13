public class RecursionBasics {
    // Print Decreasing Oreder
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }
    // Print Increasing Order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }
    // Print Factorial Of N Number
    public static int facto(int n) {
        if (n == 0) {
            return  1;
        }
        return n * facto(n - 1);
    }
    // Print Sum Of All N Number
    public static int sumOfAll(int n) {
        if (n == 0) {
            return 1;
        }
        return n + sumOfAll(n - 1);
    }
    // Print Fibonacci Number
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    // Check Array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    // Find The First Occurence of an element in Array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
    // Find The Last Occurence of an element in Array
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFaund = lastOccurence(arr, key, i + 1);
        if (isFaund == -1 && arr[i] == key) {
            return i;
        }
        return isFaund;
    }
    // Print X^n
    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * pow(x, n - 1);
    }
    // Print X^n in O(logn)
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    // Tiling Problem
    public static void printInc(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i + " ");
        printInc(i + 1, n);
    }
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }
    public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, i+1, newstr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, i+1, newstr.append(currChar), map);
        }
    }
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinStrings(n - 1, 0, str+"0");        
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str+"1");
        }
    }
    public static int Fibonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return (n - 1) + (n - 2);
    }
    static String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void printDigits(int n) {
        if(n == 0) return;
        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // printInc(n);
        // System.out.println(sumOfAll(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(lastOccurence(arr, 3, 0));
        // System.out.println(pow(2, 10));
        // System.out.println(optimizedPower(2, 10));
        // printInc(1, 5);
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tilingProblem(4));
        // System.out.println(friendsPairing(3));
        // printBinStrings(3, 0, "");
        // System.out.print(Fibonacci(5) + " ");
        printDigits(2019);
    }
}
