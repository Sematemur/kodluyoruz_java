import java.util.Scanner;
public class kombinasyonhesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("C(n,r) değerini girin \n n :");
        int n=input.nextInt();
        System.out.println(" r:");
        int r=input.nextInt();
        
        int islemn=1;
        int islemr=1;
        int islemk=1;
        for(int i=1;i<=n;i++)
        {
        islemn=islemn*i;
        }
        for(int j=1;j<=r;j++)
        {
        islemr=islemr*j;
        }
        for(int k=1;k<=(n-r);k++)
        {
        islemk=islemk*k;
        }
        int sonuc=islemn/(islemr*islemk);
        System.out.println("sonuc:"+sonuc);

    }
}
