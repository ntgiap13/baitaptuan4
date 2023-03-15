import java.util.*;
public class bai9 {
    public static void main(String[] args) {
    String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao chuoi bat ki : ");
    chuoi = scanner.nextLine();
    System.out.println("Ky tu trong chuoi la : ");
    for (int i = 0; i < chuoi.length(); i++) {
        // charAt cha ve ki tu chuoi
        kyTu = chuoi.charAt(i);
        System.out.println(kyTu);
    }
}
}
