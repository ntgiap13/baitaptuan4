import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi : ");
        String chuoi = sc.nextLine();

        System.out.print("Nhap ki tu : ");
        char ch = sc.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ch) {
                dem++;
            }
        }

        System.out.println("So lan xuat hien cua ki tu '" + ch + "' trong chuoi '" + chuoi + "' la: " + dem);
    }
}
