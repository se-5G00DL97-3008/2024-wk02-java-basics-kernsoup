import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number (-1 to quit):");
        int number = sc.nextInt();
        float total = 0;
        int counter = 0;
        while (number != -1) {
            total += number;
            counter += 1;
            System.out.println("Average: " + total / counter);
            System.out.println("Give a number (-1 to quit):");
            number = sc.nextInt();
        }
    }
}
