import java.util.Scanner;
public class üslüsayıhesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("değer giriniz");
        int sayi=input.nextInt();
        System.out.println("üs değerini giriniz");
        int us=input.nextInt();
        int sonuc=1;
        for(int i=1;i<=us;i++)
        {
        sonuc=sonuc*sayi;
        }
        System.out.println("sonuc:"+sonuc);
    }
}
