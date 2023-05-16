import java.util.Scanner;
public class dörtvebeşinkatları {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi=input.nextInt();
        for(int i=0;i<=sayi;i++)
        {
        if(i%4==0 && i%5==0)
        {
        System.out.println(i);
        }
        }
    }
}
