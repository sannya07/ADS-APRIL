public class FibonacciRecursion {

    static int[] dp; // For memoization

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibmemo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dp[n] != 0) return dp[n];

        int ans = fibmemo(n - 1) + fibmemo(n - 2);
        dp[n] = ans;
        return ans;
    }

    public static int fibtab(int n) {
        if (n <= 1) return n;

        int[] dp2 = new int[n + 1];
        dp2[0] = 0;
        dp2[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp2[i] = dp2[i - 1] + dp2[i - 2];
        }

        return dp2[n];
    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Plain Recursion: " + fib(n)); // O(2^n)

        dp = new int[n + 1]; // Initialize for memoization
        dp[0] = 0;
        dp[1] = 1;
        System.out.println("Memoization: " + fibmemo(n)); // O(n)

        System.out.println("Tabulation: " + fibtab(n)); // O(n)
    }
}
