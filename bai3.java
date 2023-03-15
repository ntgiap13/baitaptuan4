import java.util.*;  


public class bai3 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ten cua ban : ");
        String ten = sc.nextLine();
        System.out.print("Tuoi cua ban : ");
        int tuoi = sc.nextInt();

        if(tuoi < 16){
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        }else if(tuoi >= 16 && tuoi < 18){
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        }else{
            System.out.println("Ban " + ten + " da gia");
        }
    }    
}
