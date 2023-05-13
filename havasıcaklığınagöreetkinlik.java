import java.util.Scanner;
public class havasıcaklığınagöreetkinlik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hava sicakliğini girin");
        double sicaklik=input.nextInt();
        if(sicaklik<5)
        System.out.println("kayak yapabilirsiniz");
        if(sicaklik>5 && sicaklik<15)
        System.out.println("sinemaya gidebilirsiniz");
        if(sicaklik>15 && sicaklik<25)
        System.out.println("pikniğe gidebilirsiniz");
        else
        System.out.println("yüzmeye gidebilirsiniz");


    }
}
