import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int number = sc.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int other = sc.nextInt();
        for (int i = 0; i <= other; i++) {
            System.out.println(String.format("%d x %d = %d", i, number, i * number));
        }
    }
}
