import java.util.Scanner;
public class sayılarısıralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("üç sayi girin \n 1.sayı :");
        int sayi_1=input.nextInt();
        System.out.println("2.sayı :");
        int sayi_2=input.nextInt();
        System.out.println("3.sayı :");
        int sayi_3=input.nextInt();
        int min=sayi_1;
        int orta;
        int son;
        if(sayi_1<sayi_2){
            min=sayi_1;
            if(sayi_2<sayi_3)
            {
                orta=sayi_2;
                son=sayi_3;

            } else
            {
                orta=sayi_3;
                son=sayi_2;
            }
        } 
        else 
        {
            min=sayi_2;
            if(sayi_1>sayi_3)
            {
           orta=sayi_3;
           son=sayi_1;
            }
            else{
                orta=sayi_1;
                son=sayi_3;
            }
        }
        if(sayi_1>sayi_3)
        {
            min=sayi_3; 
            if(sayi_1>sayi_2)
            {
           orta=sayi_2;
           son=sayi_1;
            } else
            {
         orta=sayi_1;
         son=sayi_2;
            }
        } 
        else{
            min=sayi_1;
          if(sayi_2<sayi_3)
            {
                orta=sayi_2;
                son=sayi_3;

            } else
            {
                orta=sayi_3;
                son=sayi_2;
            }
        } 
      System.out.println(min+""+orta+""+son);
    }
    
}
