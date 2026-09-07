public class Main {
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        int sum = 0;

        do {
            sum = sum + i;
            i = i + 2;
            count++;
        } while (count < 10);

        System.out.println("Sum of first 10 even numbers = " + sum);
    }
}