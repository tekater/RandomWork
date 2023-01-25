import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите K:");
        double k = scanner.nextInt(); // seed
        System.out.println("Введите N:");
        double n = scanner.nextInt(); //
        System.out.println("Введите M:");
        double m = scanner.nextDouble(); // цикл гаусовых чисел
        while (true) {

            Random random = new Random((int) k);

            for (int i = 1; i <= n; i++) {
                double g = random.nextGaussian();

                if (random.nextGaussian() <= m) {
                    if(i == n) {
                        System.out.println("Наш сид:" + " " + (int) k);
                        return;
                    }
                } else {
                    k++;
                    break;
                }

            }
        }

    }
}
