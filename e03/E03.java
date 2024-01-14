import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive number\n");
        } else {
            System.out.println("Negative number\n");
        }
    }
}
