public class Examen1 {
    public static boolean isPrimeIterative (int n) {
        for (int i=2; i<n; i++){
            if (n % i==0){
                return " no es primo";
            }
            return "es primo";
        }
    }
}
/*public class Examen1 {
    public static boolean isPrimeIterative(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
} */

