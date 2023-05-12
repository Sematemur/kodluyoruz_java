import java.util.Scanner;
public class Manavkasaprogramı {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
     double armut=2.14;
     double elma=3.67;
     double domates=1.11;
     double muz=0.95;
     double patlıcan=5.00;
     System.out.println("Armut Kaç Kilo ?");
     double armuthesap=input.nextDouble();
     System.out.println("elma Kaç Kilo ?");
     double elmahesap=input.nextDouble();
     System.out.println("domates Kaç Kilo ?");
     double domateshesap=input.nextDouble();
     System.out.println("muz Kaç Kilo ?");
     double muzhesap=input.nextDouble();
     System.out.println("patlıcan Kaç Kilo ?");
     double patlıcanhesap=input.nextDouble();
     double tutar=(armut*armuthesap)+(elma*elmahesap)+(domates*domateshesap)+(muz*muzhesap)+(patlıcan*patlıcanhesap);
    System.out.println("toplam tutar:"+tutar);
    }
    
}
