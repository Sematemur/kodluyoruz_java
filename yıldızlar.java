import java.util.Scanner;
public class yıldızlar
{
    public static void main(String[] args) 
    {
    int sayi=1;
    Scanner input=new Scanner(System.in);
    System.out.println("n sayisini giriniz \n :n");
    int n=input.nextInt();
    for(int i=0;i<n/2;i++) 
    {
    System.out.println();
    for(int h=0;h<sayi;h++)
    {
        System.out.print("*");
    }
    sayi=sayi+2;
    }
    for(int i=0;i<n/2;i++)
    {
    sayi=sayi-2;
    System.out.println();
    for(int h=0;h<sayi;h++)
    {
        System.out.print("*");
    }
    
    }

   }
}
    
