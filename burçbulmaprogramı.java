import java.util.Scanner;
public class burçbulmaprogramı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("doğduğunuz ayi giriniz");
        String ay=input.nextLine();
        System.out.println("doğduğunuz günü giriniz");
        int gün=input.nextInt();
        if(gün>=22  &&  ay.equals("aralik") || gün<=21 && ay.equals("ocak"))
        {
        System.out.println("burcunuz oğlak");
        }
        if(gün>=22 && ay.equals("ocak")|| gün<=19 && ay.equals("subat"))
        {System.out.println("burcunuz kova");}
        if(gün>=20 &&  ay.equals("subat") || gün<=20 && ay.equals("mart")
        )
        {System.out.println("burcunuz balik");}
        if(gün>=21 &&  ay.equals("mart") || gün<=20 && ay.equals("nisan")
        )
        {System.out.println("burcunuz koç");}
        if(gün>=21 &&  ay.equals("nisan") || gün<=21 && ay.equals("mayis"))
        {System.out.println("burcunuz boğa");}
        if(gün>=22 &&  ay.equals("mayis") || gün<=22 && ay.equals("haziran"))
        {System.out.println("burcunuz ikizler");}
        if(gün>=23 &&  ay.equals("haziran") || gün<=22 && ay.equals("temmuz"))
        {System.out.println("burcunuz yengeç");}
        if(gün>=23 &&  ay.equals("temmuz") || gün<=22 && ay.equals("agustos"))
        {System.out.println("burcunuz aslan");}
        if(gün>=23 &&  ay.equals("agustos") || gün<=22 && ay.equals("eylul"))
        {System.out.println("burcunuz başak");}
        if(gün>=23 &&  ay.equals("eylul") || gün<=22 && ay.equals("ekim"))
        {System.out.println("burcunuz terazi");}
        if(gün>=23 &&  ay.equals("ekim") || gün<=21 && ay.equals("kasim"))
        {System.out.println("burcunuz akrep");}
        if(gün>=22 &&  ay.equals("kasim") || gün<=21&& ay.equals("aralik"))
        {System.out.println("burcunuz yay");}

    
    }
}
