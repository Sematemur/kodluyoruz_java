import java.util.Scanner;
public class harmoniksayıbulma{
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("n sayisini giriniz \n :n");
     int n=input.nextInt();
     double sonuc=0.0;
     for(int i=1;i<=n;i++)
     {
      sonuc=(1.0/i)+sonuc;
     }
     System.out.println("sonuc:"+sonuc);
}   
}
