import java.util.Scanner;
public class dairealanvecevre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("dairenin yarıcapını ve açıyı giriniz");
        double pi=3.14;
        double yarıcap=input.nextDouble();
        double acı=input.nextDouble();
        double cevre=2*pi*yarıcap;
        double alan=(pi*yarıcap*yarıcap*acı)/360;
        System.out.println("dairenin alanı:"+alan+"\n dairenin cevresi:"+cevre);
    }
    
}
