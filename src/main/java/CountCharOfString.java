import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        String myName = "Do Phu Huong";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu muon dem trong chuoi");
        char character = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < myName.length(); i++) {
            if (myName.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Co " + count + " lan xuat hien cua ky tu " + character + " trong chuoi");
    }
}
