import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int number = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", i, number, i * number));
        }
    }
}
