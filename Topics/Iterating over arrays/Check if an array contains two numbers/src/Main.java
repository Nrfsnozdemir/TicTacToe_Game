import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean result = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (n == array[i] && m == array[i + 1] || m == array[i] && n == array[i + 1]) {
                result = true;
                break;
            }
        }

        System.out.println(result);
    }
}