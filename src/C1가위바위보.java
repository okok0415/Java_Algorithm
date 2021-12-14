import java.util.Scanner;

public class C1가위바위보 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.println("철수 >>");
        String result = scanner.next();
        System.out.println("영희 >>");
        String result2 = scanner.next();

        if (result.equals("가위")) {
            if (result2.equals("가위")) {
                System.out.println("동점");
            } else if (result2.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            } else if (result2.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            }
        } else if (result.equals("바위")) {
            if (result2.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (result2.equals("바위")) {
                System.out.println("동점");
            } else if (result2.equals("보")) {
                System.out.println("영희가 이겼습니다.");
            }
        } else if (result.equals("보")) {
            if (result2.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            } else if (result2.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (result2.equals("보")) {
                System.out.println("동점");
            }
        }

        scanner.close();

    }
}
