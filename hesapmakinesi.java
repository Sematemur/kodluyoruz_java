import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen sayıları giriniz \n 1.sayı :");
        double sayi_1=input.nextDouble();
        System.out.println("2.sayı:");
        double sayı_2=input.nextDouble();
        System.out.println("1-toplama \n 2-cıkarma \n 3-carpma \n 4-bölme");
        int islem=input.nextInt();
        switch(islem){
            case 1:
            double sonuc=sayi_1+sayı_2;
            System.out.println("sonuc:"+sonuc);
            break;
            case 2:
            double cıkarmasonuc=sayi_1-sayı_2;
            System.out.println("sonuc:"+cıkarmasonuc);
            break;
            case 3:
            double carpmasonuc=sayi_1*sayı_2;
            System.out.println("sonuc:"+carpmasonuc);
            break;
            case 4:
            double bolmesonuc=sayi_1/sayı_2;
            System.out.println("sonuc:"+bolmesonuc);
            break;
            default:
            System.out.println("lütfen gecerli bir sayı giriniz");
            break;
        }
    }
}
