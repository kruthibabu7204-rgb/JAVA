public class Main {
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        int sum = 0;

        while (count < 10) {
            sum = sum + i;
            i = i + 2;
            count++;
        }

        System.out.println("Sum of first 10 even numbers = " + sum);
    }
}