import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number (0 to quit):");
        int number = sc.nextInt();
        while (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            System.out.println("Give a number (0 to quit):");
            number = sc.nextInt();
        }
    }
}
