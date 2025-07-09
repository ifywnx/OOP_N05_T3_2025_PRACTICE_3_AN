public class TestRecursion {
    public static void test() {
        int n = 5;
        System.out.println(n + "! = " + Recursion.factorial(n));

        int m = 10;
        System.out.println("Tổng từ 1 đến " + m + " = " + Recursion.sumToN(m));
    }
}
