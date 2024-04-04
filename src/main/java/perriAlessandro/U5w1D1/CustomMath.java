package perriAlessandro.U5w1D1;

public class CustomMath {
    static public int sum(int a, int b) {
        return a + b;
    }

    static public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
