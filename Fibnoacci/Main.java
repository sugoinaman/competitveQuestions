public class Main {
    public static void main(String[] args) {
        climbStairs(3);
    }

    public static void climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}

