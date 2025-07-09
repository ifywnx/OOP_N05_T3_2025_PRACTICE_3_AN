public class Recursion {
    // Tính giai thừa n! = n * (n - 1) * ... * 1
    public static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Tính tổng từ 1 đến n bằng đệ quy (optional)
    public static int sumToN(int n) {
        if (n <= 0)
            return 0;
        return n + sumToN(n - 1);
    }
}
