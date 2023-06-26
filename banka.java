import java.util.Scanner;
import java.util.concurrent.Executor;
public class banka {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int bakiye=20000;
       int sayac=3;
       while(sayac>0)
       { //burası giriş için
         System.out.println("lütfen kimlik no ve şifrenizi  \n kimlik no:");
       int kimlikno=input.nextInt();
       System.out.println("sifrenizi giriniz");
       String sifre=input.next();
////////////////////////////////////////
            if(kimlikno==123 && sifre.equals("banka")) //burası işlemler için
            {
              System.out.println("giriş başarılı");
              while(true)
              {
                System.out.println("merhaba lütfen yapmak istediğiniz işlemi seçin \n 1:bakiye göster \n 2:para yatır \n 3:para cek \n 4:cıkıs yap");
              int tercih=input.nextInt();
                switch(tercih){
                case 1:
                System.out.println("bakiyeniz:"+bakiye);
                break;
                case 2:
                System.out.println("yatırmak istediginiz miktar:");
                int miktar=input.nextInt();
                bakiye=bakiye+miktar;
                System.out.println("bakiyeniz:"+bakiye);
                break;
                case 3:
                System.out.println("cekmek istediginiz miktar:");
                int miktarcek=input.nextInt();
                bakiye=bakiye-miktarcek;
                System.out.println("bakiyeniz:"+bakiye);
                break;
                case 4:
                System.out.println("cıkıs yapılıyor");
                return;
                default:
                System.out.println("hatalı giriş yaptınız");
                break;
              }
            }
              
            }////////////////////////////////////////////////////////////////////////
            else
            {
                sayac=sayac-1;
               System.out.println("giriş başarısız \n lütfen tekrar deneyin ,kalan hakkınız:"+sayac);
            }

       }
   




















    }
}
