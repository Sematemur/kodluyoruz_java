import java.util.Scanner;
public class diküçgenalan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double uzun,kısa,taban;
        System.out.println("ücgenin uzun kenarını giriniz");
        uzun=input.nextDouble();
        System.out.println("ücgenin kısa kenarını giriniz");
        kısa=input.nextDouble();
        System.out.println("ücgenin taban kenarını giriniz");
        taban=input.nextDouble();
        double islem=(uzun*taban)/2;
        System.out.println("dik üçgenin alanı:"+islem);

    }
    
}
