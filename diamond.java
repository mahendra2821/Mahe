    import java.util.Scanner;
    public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the diamond (an odd number):");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Please enter an odd number as the height.");
        } else {
            printDiamond(height);
        }
    }

    public static void printDiamond(int height) {
        int space = height / 2;
        int stars = 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= height / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
    }
    }