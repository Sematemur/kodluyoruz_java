import java.util.Scanner;
public class basamaksayılarıtoplamı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi=input.nextInt();
        int kalan=1;
        int sonuc=0;
        while(sayi !=0 && kalan !=0)
        {
        kalan=sayi%10;
        sayi=sayi/10;
        System.out.println(sayi+"  "+kalan);
        sonuc=sonuc+kalan;
        }
   System.out.println("sonuc:"+sonuc);
    }
}
