class Solution {
    public double myPow(double x, int n) {
        if (x == 1 || x == 0) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        
        // Handle the case where n is Integer.MIN_VALUE
        long nn = n;
        if (nn < 0) {
            nn = -nn;
            x = 1 / x;
        }

        double result = 1;
        double currentProduct = x;

        // Exponentiation by squaring (iterative version)
        while (nn > 0) {
            if (nn % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            nn /= 2;
        }

        return result;
    }
}
