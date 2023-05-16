import java.util.Scanner;
public class ücevedordebolen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi  girin");
        int sayi=input.nextInt();
         int islem=0;
        int sayac=0;
        for(int i=0;i<=sayi;i++)
        {
         if(i%3 ==0 && i%4==0)
         {
            System.out.println(i+" : 3 e ve 4 e bolunebilir");
         }
            islem=islem/sayac;
         System.out.println("islem");
         
        }
    
}
}
