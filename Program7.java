import java.util.Scanner;

public class Program7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int x = 1;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++, x++) {
                    if (j % 2 != 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                System.out.println(" ");

            }
        }
    }

