package power;

public class Power_x_n {
    public static void main(String[] args) {
        System.out.println("Test Case 1 : " + new Power_x_n().myPow(-2.00000, -2147483648));
        System.out.println("Test Case 2 : " + new Power_x_n().myPow(2.00000, -2147483648));
        System.out.println("Test Case 3 : " + new Power_x_n().myPow(1, -2147483648));
        System.out.println("Test Case 4 : " + new Power_x_n().myPow(-1.00000, -2147483648));
    }

    public double myPow(double x, int n) {
        if (x == 0.0 || x == 1) return x;
        if (n == 0) return 1;
        if (n == 1) return x;
        long N = n; // because the Integer.
        if (N < 0) {
            x = 1 / x;
            N = N * -1;
        }
        if (N % 2 == 0) {//even
            return myPow(x * x, (int) (N / 2));
        } else { // odd
            return x * myPow(x * x, (int) (N / 2));
        }
    }
}
