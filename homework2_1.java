/**
 * homework2_1
 */
public class homework2_1 {
    public static void main(String [] args) {
        double x = 2;
        int n = -2 ;
        System.out.println(myPow(x,n));
    }
    public static  double myPow(double x, int n) {
        if (n < 0){
            return( 1 / (myPow(x, -n)));
        }
        if (n == 1) {
            return x;
        }
        return (x * myPow(x, n-1));
    }
}