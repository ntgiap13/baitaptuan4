import java.util.*;
public class bai12 {
    public static void main(String[] args){
        // m dong n cot
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong : ");
        m = sc.nextInt();
        System.out.print("Nhap so cot : ");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        System.out.print("Nhap phan tu cua ma tran :");
        for(int i= 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("A["+i+"]["+j+"]=");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang vua nhap la :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        // tim mãx cua mang
        int max = A[0][0];
        for(int i= 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.print("Phan tu lon nhat trong mang :" +max);
}
}
