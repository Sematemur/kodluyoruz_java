import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("lütfen para degerini giriniz");
        double deger=input.nextDouble();
        System.out.println("kdvsiz fiyat:"+deger);
        System.out.println((deger)>1000 ? ("kdv tutarı :"+deger*0.8 + " \n kdvli fiyat:"+(deger+deger*0.8)):("kdv tutarı :"+deger*0.18+" \nkdvli fiyat:"+(deger+deger*0.18)));
        
        
    }
    
}
