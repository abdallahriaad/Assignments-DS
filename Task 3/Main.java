
class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int targ = 3; 
        System.out.println(searchForTargetLinear(arr, targ)); // -1
        System.out.println(searchForTargetBinary(arr, targ)); // -1
        
        System.out.println(fibonacciExponential(6)); // 8
        System.out.println(fibonacciByArray(6)); // 8

        System.out.println(factorialArray(5)); // 120
        System.out.println(factorial(5)); // 120
    }

    // Exercise 01 - Linear & Binary Search
    // A.
    public static int searchForTargetLinear(int[] arr, int target) {
        if (arr == null)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // B.
    public static int searchForTargetBinary(int[] arr, int target) {
        if (arr == null)
            return -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Exercise 02 - Fibonacci Sequence
    // A.
    public static int fibonacciExponential(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Enter the positive Number");
        }
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        return fibonacciExponential(num - 1) + fibonacciExponential(num - 2);
    }

    // B.
    public static int fibonacciByArray(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Enter the positive Number");
        }
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        int[] fib = new int[num + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[num];
    }

    // Exercise 03 - Factorial: Space Optimization
    // A.
    public static long factorialArray(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Enter the positive Number");
        }
        if (num == 0 || num == 1)
            return 1;

        long[] fact = new long[num + 1];
        fact [0] = 1;
        fact [1] = 1;

        for (int i = 2; i <= num; i++) {
            fact[i] = fact[i - 1] * i;
        }
        return fact[num];
    }
    // B.
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Enter the positive Number");
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}