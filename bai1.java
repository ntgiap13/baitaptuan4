import java.util.*;  
class bai1   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); 

System.out.print("Nhap vao so a : ");  
int a= sc.nextInt();  
System.out.print("Nhap vao so b : ");  
int b= sc.nextInt();  
int tong=a+b;  
System.out.println("Tong a va b : " +tong);  
int hieu=a-b;
System.out.println("Hieu a va b : " +hieu);  
int tich=a*b;
System.out.println("Tich a va b : " +tich);  
int thuong=a/b;
System.out.println("Thuong a va b : " +thuong);  


System.out.println("Ket qua so sanh 2 so a va b :");
if(a > b){
    System.out.println(a  + " > " + b + "Dung");
}else if(a == b){
    System.out.println(a  + " = " + b + "Dung");
}
else{
    System.out.println(a  + " > " + b + "Sai");
}

}
}  