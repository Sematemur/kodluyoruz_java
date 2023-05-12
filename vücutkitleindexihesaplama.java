import java.util.Scanner;
public class vücutkitleindexihesaplama {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        double boy,kilo;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu  giriniz");
        kilo=input.nextDouble();
        double islem=kilo/(boy*boy);
        System.out.println("vücut kitle indexsiniz:"+islem);
    }
}
