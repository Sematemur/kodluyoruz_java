import java.util.Scanner;
public class kullanıcıgirisi {
    public static void main(String[] args)
     {
        String asilsifre="sema";
        Scanner input=new Scanner(System.in);
        System.out.println("şifrenizi giriniz");
        String sifre=input.nextLine();
        if(asilsifre.equals(sifre)){
            System.out.println("sifreniz dogru");
        }
        else
        {
            System.out.println("şifrenizi yanlış girdiniz");
            System.out.println("şifrenizi sıfırlamak istiyor musunuz? \n evet ,hayir");
            String islem=input.nextLine();
                if(islem.equals("hayir"))
                        {
                            System.out.println("şifreniz sıfırlanmayacak");
                        }
                else
                        {
                            System.out.println("yeni şifreninizi giriniz");
                            String yenisifre=input.nextLine();
                            if(yenisifre.equals("sema"))
                              System.out.println("şifre oluşturulamadı,lütfen başka şifre giriniz");
                            else
                            System.out.println("şifre oluşturuldu");
                        }
        }

    }
    
}
