import java.util.Scanner;

import javax.sound.sampled.BooleanControl;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner input=new Scanner(System.in);
    int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik ;
    System.out.println("Lütfen matematik notunu giriniz");
    Matematik=input.nextInt();
    System.out.println("Lütfen fizik notunu giriniz");
    Fizik=input.nextInt();
    System.out.println("Lütfen kimya notunu giriniz");
    Kimya=input.nextInt();
    System.out.println("Lütfen TURKCE  notunu giriniz");
    Türkçe=input.nextInt();
    System.out.println("Lütfen tarih notunu giriniz");
    Tarih=input.nextInt();
    System.out.println("Lütfen muzik notunu giriniz");
    Müzik=input.nextInt();
    double ortalama=(Matematik+ Fizik+ Kimya+ Türkçe+Tarih+ Müzik)/6;
    System.out.println("ortalamanız:"+ortalama);
    boolean buyuk= ortalama>60;
    System.out.println((buyuk)? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
