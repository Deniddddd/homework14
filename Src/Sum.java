import java.util.Random;
public class Sum {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            int val = random.nextInt(100011) + 11;
            System.out.println("value = " + val + " sum = " + sumDigits(val));

        }
    }
    public static int sumDigits(int val) {
        if (val < 1) return val;
        return val % 10 + sumDigits(val / 10);
    }
}
