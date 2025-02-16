public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i < 1000000; i++) {
            if (isCircularPrime(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean prime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    static boolean isCircularPrime(int number) {
        String numStr = Integer.toString(number);
        int length = numStr.length();

        for (int i = 0; i < length; i++) {
            if (!prime(Integer.parseInt(numStr))) {
                return false;
            }
            numStr = numStr.substring(1) + numStr.charAt(0);
        }

        return true;
    }
}
