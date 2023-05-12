import java.util.Scanner;
public class taksimetreprogramı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kilometre giriniz");
        double kilometre=input.nextDouble();
        System.out.println((kilometre<20)? "ödenecek tutar : 20":"ödenmesi gereken ücret"+(10+kilometre*2.20));
    }
    
}
