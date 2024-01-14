import java.util.Scanner;

class E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = sc.nextInt();
        System.out.println("Enter a month: ");
        int month = sc.nextInt();
        if (day == 24 & month == 12) {
            System.out.println("Merry Christmas");
        }
    }
}
