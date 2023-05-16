import java.util.Scanner;
public class teksayılarıntoplamı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        int islem=0;
        do
        {
            System.out.println("sayiyi  girin");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0)
            {
            islem=islem+sayi;
            }
        }
        while(sayi%2 == 0);

        System.out.println(islem);
    }
    
}
