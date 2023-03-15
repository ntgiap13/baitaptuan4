import java.util.*;

public class bai2 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so bat ki : ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("So vua nhap la so chan");
        }else{
            System.out.println("So vua nhap la so le");
        }
    }
}
