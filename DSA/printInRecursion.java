public class printInRecursion {
    public static void printH(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello World");
        printH(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printH(n);
    }
}
 