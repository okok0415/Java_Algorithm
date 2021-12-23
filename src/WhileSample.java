import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != -1) {
            sum += n;
            count++;
            n = scanner.nextInt();
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.print(count);
            System.out.println((double) sum / count);
        }
    }
}