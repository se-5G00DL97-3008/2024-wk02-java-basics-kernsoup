import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int first = sc.nextInt();
        System.out.println("Give a number: ");
        int second = sc.nextInt();

        System.out.println(String.format("%d + %d = %d", first, second, first + second));
        System.out.println(String.format("%d - %d = %d", first, second, first - second));
        System.out.println(String.format("%d x %d = %d", first, second, first * second));
        System.out.println(String.format("%d / %d = %d", first, second, first / second));
    }
}
