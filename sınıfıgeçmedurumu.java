import java.util.Scanner;
public class sınıfıgeçmedurumu {
    public static void main(String[] args)
     {
       int matematik,fizik,turkce,kimya,muzik;
       Scanner input=new Scanner(System.in);
       int a=0;
       System.out.println("ders notlarinizi giriniz matematik :");
       matematik=input.nextInt();
       if(matematik<0 || matematik>100)
       {
        matematik=0;
        a=a+1;
       }
       System.out.println("fizik :");
       fizik=input.nextInt();
       if(fizik<0 ||fizik>100)
       {
        fizik=0;
        a=a+1;
       }
       System.out.println("turkce:");
       turkce=input.nextInt();
       if(turkce<0 || turkce>100)
       {
        turkce=0;
        a=a+1;
       }
       System.out.println("kimya:");
       kimya=input.nextInt();
       if(kimya<0 ||kimya>100)
       {
        kimya=0;
        a=a+1;
       }
       System.out.println("müzik :");
       muzik=input.nextInt();
       if(muzik<0 ||muzik>100)
       {
        muzik=0;
        a=a+1;
       }
       int ortalama=(matematik+fizik+turkce+kimya+muzik)/(5-a);
       System.out.println("ortalamanız:"+ortalama);
       if(ortalama>55)
       System.out.println("geçtiniz");
       else 
       System.out.println("kaldiniz");
    }
    
}
